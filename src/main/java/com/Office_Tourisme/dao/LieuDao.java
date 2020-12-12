package com.Office_Tourisme.dao;


import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.Office_Tourisme.model.Lieu;



public class LieuDao implements ILieuDao {
	
	@PersistenceContext
	private EntityManager em;



	public List<Lieu> listLieu() {
		Query req = em.createQuery("SELECT l FROM Lieu l");
		return req.getResultList();
	}


	public Lieu getLieu(String codeInsee) {
		return em.find(Lieu.class, codeInsee);
	}

	
}
