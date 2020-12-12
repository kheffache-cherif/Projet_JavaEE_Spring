package com.Office_Tourisme.Service;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import com.Office_Tourisme.dao.IDepartementDao;
import com.Office_Tourisme.model.Departement;

@Transactional
public class DepartementService implements IDepartementService{
	
	private IDepartementDao daod;

	public void setDaod(IDepartementDao dao) {
		this.daod = dao;
	}

	public List<Departement> listDepartement() {
		return daod.listDepartement();
	}

	public Departement getDepartement(String dep) {
		return daod.getDepartement(dep);
	}


}
