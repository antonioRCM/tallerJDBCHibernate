package org.springframework.samples.petclinic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface VetRepository2 extends JpaRepository<Vet, Integer>{

//	@Override
//	default List<Vet> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
