package com.Office_Tourisme.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.Office_Tourisme.model.Celebrite;

public interface ICelebriteService {
	
	
	Celebrite saveCelebrite(Celebrite c);// objet de type celebrite et l'en register dans bd
	Celebrite updateCelebrite(Celebrite c);// ...//   // le modifie et l'  //
	void deleteCelebrite(Celebrite c);  // c'est une entité
	void deleteCelebriteById(Integer id);  // juste l'id
	Celebrite getCelebrite(Integer id);  // retourn objet celebrité via Id
	List<Celebrite> getAllCelebrites();   // la liste
	
	List<Celebrite> findByNom(String nom);
	List<Celebrite> findByNomContains(String nom);
	Page<Celebrite> getAllCelebritesParPage(int page, int size);
}
/*creation d'une une implementation 
 *  si j'aurais besopin de methode plus complexe je declare cette methode ici 
 *  et je fais l'implementation '
*/

