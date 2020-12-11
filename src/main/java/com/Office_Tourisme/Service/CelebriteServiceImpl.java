package com.Office_Tourisme.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Office_Tourisme.Repository.CelebriteRepository;
import com.Office_Tourisme.model.Celebrite;

@Service   // ctte classe elle sagit d'un service 
public class CelebriteServiceImpl implements CelebriteService {
	@Autowired// injection implementation de cette interface 	
	CelebriteRepository celebriteRepository;
	
	@Override
	public Celebrite saveCelebrite(Celebrite c) {
		
		return celebriteRepository.save(c);
	}

	@Override
	public Celebrite updaCelebrite(Celebrite c) {
		return celebriteRepository.save(c);
		
	}

	@Override
	public void deleteCelebrite(Celebrite c) {
		celebriteRepository.delete(c);
	}

	@Override
	public void deleteCelebriteById(Integer id) {
		celebriteRepository.deleteById(id);
	}

	@Override
	public Celebrite getCelebrite(Integer id) {
		 return celebriteRepository.findById(id).get();

		
	}

	@Override
	public List<Celebrite> getAllCelebrite() {
		
		return celebriteRepository.findAll();
	}

}
