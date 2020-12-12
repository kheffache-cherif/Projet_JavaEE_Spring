package com.Office_Tourisme.Service;

import java.util.List;

import com.Office_Tourisme.model.Departement;



public interface IDepartementService {
	
	public List<Departement> listDepartement();
	public Departement getDepartement(String dep);

}
