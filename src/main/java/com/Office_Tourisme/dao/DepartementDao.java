package com.Office_Tourisme.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.Office_Tourisme.model.Departement;



public class DepartementDao implements IDepartementDao {
	
	@PersistenceContext
	private EntityManager em;

	
	public List<Departement> listDepartement() {
		Query req = em.createQuery("SELECT d FROM Departement d");
		return req.getResultList();
	}


	public Departement getDepartement(String dep) {
		return em.find(Departement.class, dep);
	}

	
}
