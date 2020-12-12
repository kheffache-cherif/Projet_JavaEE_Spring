package com.Office_Tourisme.dao;

import java.util.List;

import com.Office_Tourisme.model.Utilisateur;



public interface IUtilisateurDao {
	
	public List<Utilisateur> listUtilisateur();
	public Utilisateur getUtilisateur(String identifiant);
	public boolean findUser(String identifiant, String mdp);
	public void addUtilisateur(Utilisateur u);

}
