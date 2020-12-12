package com.Office_Tourisme.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.Office_Tourisme.model.Utilisateur;



public class UtilisateurDao implements IUtilisateurDao{

	@PersistenceContext
	private EntityManager em;
	
	
	public List<Utilisateur> listUtilisateur() {
		
		Query req = em.createQuery("SELECT u FROM Utilisateur u");
		return req.getResultList();
	}


	public Utilisateur getUtilisateur(String identifiant) {
		
		return em.find(Utilisateur.class, identifiant);
		
	}

	public boolean findUser (String identifiant, String mdp) {
		
		String sql = "SELECT u FROM Utilisateur u where u.identifiant=:identifiant and u.mdp=:mdp";
		Query req = em.createQuery(sql);
		req.setParameter("identifiant", identifiant);
		req.setParameter("mdp", mdp);
		List<Utilisateur> list = req.getResultList();
		if (list.size() > 0) {
		    return true;
		}
			return false;
    }


	public void addUtilisateur(Utilisateur u) {
		
		em.persist(u);
	}
}