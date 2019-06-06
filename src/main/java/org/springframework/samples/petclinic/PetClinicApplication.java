/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.samples.petclinic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.samples.petclinic.repository.SpecialtyRepository2;
import org.springframework.samples.petclinic.repository.VetRepository2;
import org.springframework.samples.petclinic.services.PetServices;
import org.springframework.samples.petclinic.vet.Specialty;
import org.springframework.samples.petclinic.vet.Vet;



/**
 * PetClinic Spring Boot Application.
 * 
 * @author Dave Syer
 *
 */

@SpringBootApplication
public class PetClinicApplication implements CommandLineRunner {

	@Autowired 
	VetRepository2 vetrepostit;
	
	@Autowired
	SpecialtyRepository2 repo;
	
	@Autowired
	PetServices ser;
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(PetClinicApplication.class, args);        
        
    }

	/*@Override
	public void run(String... args) throws Exception {
		
		Vet ve = new Vet();
		ve.setFirstName("Eustakio");
		ve.setLastName("Gafotas");
		ve =vetrepostit.save(ve);
		
		if(ve.getId()>0) {
			Specialty sp = repo.findOne(1); //Seleccion la especialidad por el id
			ve.addSpecialty(sp); //Añado la especialidad al vet
			vetrepostit.save(ve); //Update
		}else {
			System.out.println("Errorr");
		}
		
		//List<Vet> vet= vetrepostit.findAll();
		
		
		
	}*/
    
    @Override
    public void run(String... args) throws Exception {
    	
    	Specialty sp = new Specialty();
    	sp.setName("Aves");
    	repo.save(sp);
    	
    	ser.altaVet("Patito", "Feo","Aves");
    }
    

}
