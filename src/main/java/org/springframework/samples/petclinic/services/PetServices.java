package org.springframework.samples.petclinic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.repository.SpecialtyRepository2;
import org.springframework.samples.petclinic.repository.VetRepository2;
import org.springframework.samples.petclinic.vet.Specialty;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.stereotype.Service;

@Service
public class PetServices {

	@Autowired 
	VetRepository2 vetrepostit;
	
	@Autowired
	SpecialtyRepository2 repo;
	
	public void altaVet(String nombre, String apellido, String especialidad) {
		
		Vet ve = new Vet();
		ve.setFirstName(nombre);
		ve.setLastName(apellido);
		ve =vetrepostit.save(ve);
		
		if(ve.getId()>0) {
			Specialty sp = repo.findByName(especialidad); //Seleccion la especialidad por el id
			ve.addSpecialty(sp); //Añado la especialidad al vet
			vetrepostit.save(ve); //Update
		}else {
			System.out.println("Errorr");
		}
		
	}
}
