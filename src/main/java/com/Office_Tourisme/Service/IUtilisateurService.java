package com.Office_Tourisme.Service;
import java.util.List;

import com.Office_Tourisme.model.Utilisateur;



public interface IUtilisateurService {
	
	public List<Utilisateur> listUtilisateur();
	public Utilisateur getUtilisateur(String identifiant);
	public boolean findUser(String identifiant, String mdp);
	public void addUtilisateur(Utilisateur u);
}
