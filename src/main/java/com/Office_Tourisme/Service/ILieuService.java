package com.Office_Tourisme.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.Office_Tourisme.model.Lieu;

public interface ILieuService {
	
	Lieu saveLieu(Lieu l);// objet de type celebrite et l'en register dans bd
	Lieu updateLieu(Lieu l);// ...//   // le modifie et l'  //
	void deleteLieu(Lieu l);  // c'est une entité
	void deleteLieuById(String id);  // juste l'id
	Lieu getLieu(String id);  // retourn objet celebrité via Id
	List<Lieu> getAllLieux();   // la liste
	
	List<Lieu> findByCodeInsee(String CodeInsee);
	List<Lieu> findByCodeInseeContains(String CodeInsee);
	Page<Lieu> getAllLieuxParPage(int page, int size);

}


