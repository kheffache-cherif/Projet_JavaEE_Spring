package com.Office_Tourisme.model;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
@Entity
@Table(name="role")
public class Role implements Serializable {
	@Id 
	@Column(name="ID_ROLE")
	private String Id_Role;
	@Column(name="NOM")
	private String nom;
	
	@ManyToOne
	@JoinColumn(name="email")
	private Utilisateur utilisateurs; 

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(String id_Role, String nom, Utilisateur utilisateurs) {
		super();
		Id_Role = id_Role;
		this.nom = nom;
		this.utilisateurs = utilisateurs;
	}

	public String getId_Role() {
		return Id_Role;
	}

	public void setId_Role(String id_Role) {
		Id_Role = id_Role;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Utilisateur getUtilisateur() {
		return utilisateurs;
	}

	public void setUtilisateur(Utilisateur utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}

