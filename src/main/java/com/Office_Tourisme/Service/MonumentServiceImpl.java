package com.Office_Tourisme.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Office_Tourisme.Repository.MonumentRepository;
import com.Office_Tourisme.model.Monument;
@Service

public class MonumentServiceImpl implements IMonumentService {
	@Autowired
	MonumentRepository monumentRepository;

	@Override
	public Monument saveMonument(Monument m) {
		
		return monumentRepository.save(m) ;
	}

	@Override
	public Monument updateMonument(Monument m) {

		return monumentRepository.save(m) ;
	}

	@Override
	public void deleteMonument(Monument m) {
		 monumentRepository.delete(m);
		
	}

	@Override
	public void deleteMonumentById(String id) {
		monumentRepository.deleteById(id); 
		
	}

	@Override
	public Monument getMonument( String id) {
		return monumentRepository.findById(id).get() ;
	}

	@Override
	public List<Monument> getAllMonuments() {
		return monumentRepository.findAll() ;
	}

	@Override
	public List<Monument> findByNomM(String nomM) {
		return monumentRepository.findByNomM(nomM);
	}

	@Override
	public List<Monument> findByNomMContains(String nomM) {
		return monumentRepository.findByNomMContains(nomM);
	}

	@Override
	public Page<Monument> getAllMonumentsParPage(int page, int size) {
		
		return monumentRepository.findAll(PageRequest.of(page, size));
	}

}
