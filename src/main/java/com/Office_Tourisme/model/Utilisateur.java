package com.Office_Tourisme.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Utilisateur implements Serializable{

	private static final long serialVersionUID = -3978013961694902937L;
	
	
	@Id
	private String identifiant;
    private String password;
    
    
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
     
     
	
	
	

}
