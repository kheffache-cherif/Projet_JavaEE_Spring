package com.Office_Tourisme.Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.Office_Tourisme.dao.IUtilisateurDao;
import com.Office_Tourisme.model.Utilisateur;

@Transactional
public class UtilisateurService implements IUtilisateurService{
	
	private IUtilisateurDao
	daou;

	public void setDaou(IUtilisateurDao daou) {
		this.daou = daou;
	}

	public List<Utilisateur> listUtilisateur() {
		return daou.listUtilisateur();
	}

	public Utilisateur getUtilisateur(String identifiant) {
		
		return daou.getUtilisateur(identifiant);
	}

	public boolean findUser(String identifiant, String mdp) {
		return daou.findUser(identifiant, mdp);
	}

	public void addUtilisateur(Utilisateur u) {
		daou.addUtilisateur(u);
	}

	

}
