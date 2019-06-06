package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.vet.Specialty;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialtyRepository2 extends JpaRepository<Specialty, Integer>{
	
	public Specialty findByName(String name);
	
}
