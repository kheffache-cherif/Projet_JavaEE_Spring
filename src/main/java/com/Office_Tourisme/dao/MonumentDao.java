package com.Office_Tourisme.dao;


import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.Office_Tourisme.model.Monument;


public class MonumentDao implements IMonumentDao {
	
	@PersistenceContext
	private EntityManager em;

	
	public void addMonument(Monument m) {
		em.persist(m);
		
	}

	
	public List<Monument> listMonument() {
		Query req = em.createQuery("SELECT m FROM Monument m");
		return req.getResultList();
	}

	
	public Monument getMonument(String codeM) {

		return em.find(Monument.class, codeM);
	}

	
	public void deleteMonument(String codeM) {
		
		Monument m = getMonument(codeM);
		em.remove(m);
	}

	
	public void updateMonument(Monument m) {
		
		em.merge(m);
	}

}
