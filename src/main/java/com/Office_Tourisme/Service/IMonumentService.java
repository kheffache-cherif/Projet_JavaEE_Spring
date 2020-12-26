package com.Office_Tourisme.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.Office_Tourisme.model.Monument;

public interface IMonumentService {
	
	Monument saveMonument(Monument m);// objet de type celebrite et l'en register dans bd
	Monument updateMonument(Monument m);// ...//   // le modifie et l'  //
	void deleteMonument(Monument m);  // c'est une entité
	void deleteMonumentById(String id);  // juste l'id
	Monument getMonument(String id);  // retourn objet celebrité via Id
	List<Monument> getAllMonuments();   // la liste
	
	List<Monument> findByNomM(String nomM);
	List<Monument> findByNomMContains(String nomM);
	Page<Monument> getAllMonumentsParPage(int page, int size);

}
