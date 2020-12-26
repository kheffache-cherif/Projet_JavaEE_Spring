package com.Office_Tourisme.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.Office_Tourisme.Repository.LieuRepository;
import com.Office_Tourisme.model.Lieu;


@Service
public class LieuServiceImpl implements ILieuService {
	
	@Autowired
	LieuRepository lieuRepository;

	
	@Override
	public Lieu saveLieu(Lieu l) {
		return lieuRepository.save(l) ;

	}

	@Override
	public Lieu updateLieu(Lieu l) {
		return lieuRepository.save(l) ;

	}

	@Override
	public void deleteLieu(Lieu l) {
		 lieuRepository.delete(l);
	}

	@Override
	public void deleteLieuById(String id) {
		lieuRepository.deleteById(id); 
	}

	@Override
	public Lieu getLieu(String id) {
		return lieuRepository.findById(id).get() ;
	}

	@Override
	public List<Lieu> getAllLieux() {
		return lieuRepository.findAll() ;
	}

	@Override
	public List<Lieu> findByCodeInsee(String CodeInsee) {
		return lieuRepository.findByCodeInsee(CodeInsee);
	}

	@Override
	public List<Lieu> findByCodeInseeContains(String CodeInsee) {
		return lieuRepository.findByCodeInseeContains(CodeInsee);
		
	}

	@Override
	public Page<Lieu> getAllLieuxParPage(int page, int size) {
		return lieuRepository.findAll(PageRequest.of(page, size));
	}

}
