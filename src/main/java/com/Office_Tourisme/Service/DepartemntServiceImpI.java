package com.Office_Tourisme.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Office_Tourisme.Repository.DepartementRepository;
import com.Office_Tourisme.model.Departement;
 @Service
public class DepartemntServiceImpI implements IDepartementService {
	   @Autowired
	   DepartementRepository departementRepository;
	   
	@Override
	public Departement saveDepartement(Departement d) {
		return departementRepository.save(d) ;
	}

	@Override
	public Departement updateDepartement(Departement d) {
		 return departementRepository.save(d) ;
	}

	@Override
	public void deleteDepartement(Departement d) {
		 departementRepository.delete(d);

	}

	@Override
	public void deleteDepartementById(String id) {
		departementRepository.deleteById(id); 

	}

	@Override
	public Departement getDepartement(String id) {
		return departementRepository.findById(id).get() ;
	}

	@Override
	public List<Departement> getAllDepartements() {
		return departementRepository.findAll() ;
	}
	

	@Override
	public List<Departement> findByDep(String dep) {
		return departementRepository.findByDep(dep);
	}

	@Override
	public List<Departement> findByDepContains(String dep) {
		return departementRepository.findByDepContains(dep);
	}

	@Override
	public Page<Departement> getAllDepartementsParPage(int page, int size) {
		return departementRepository.findAll(PageRequest.of(page, size));
	}

}
