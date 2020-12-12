package com.Office_Tourisme.dao;

import java.util.List;

import com.Office_Tourisme.model.Departement;

public interface IDepartementDao {
	public List<Departement> listDepartement();
	public Departement getDepartement(String dep);
	

}
