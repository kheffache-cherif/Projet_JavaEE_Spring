package com.Office_Tourisme.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.Office_Tourisme.model.Departement;

public interface IDepartementService {
	
	Departement saveDepartement(Departement d);// objet de type celebrite et l'en register dans bd
	Departement updateDepartement(Departement d);// ...//   // le modifie et l'  //
	void deleteDepartement(Departement d);  // c'est une entité
	void deleteDepartementById(String id);  // juste l'id
	Departement getDepartement(String id);  // retourn objet celebrité via Id
	List<Departement> getAllDepartements();   // la liste
	
	List<Departement> findByDep(String dep);
	List<Departement> findByDepContains(String dep);
	Page<Departement> getAllDepartementsParPage(int page, int size);
}
