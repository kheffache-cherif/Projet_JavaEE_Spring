package com.Office_Tourisme.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Utilsateur")
public class Utilisateur  implements Serializable{
	@Id	
	    private String email;
		@Column(name ="nom")
	    private String nom;
		@Column(name = "prenom")
	    private String prenom;
		@Column(name ="password")
	    private String password;
		
		@OneToMany(mappedBy = "utilisateurs",fetch=FetchType.LAZY)
		private Collection<Role> roles;
		

		public Utilisateur() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Utilisateur(String email, String nom, String prenom, String password, Collection<Role> roles) {
			super();
			this.email = email;
			this.nom = nom;
			this.prenom = prenom;
			this.password = password;
			this.roles = roles;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getNom() {
			return nom;
		}


		public void setNom(String nom) {
			this.nom = nom;
		}


		public String getPrenom() {
			return prenom;
		}


		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public Collection<Role> getRoles() {
			return roles;
		}


		public void setRoles(Collection<Role> roles) {
			this.roles = roles;
		}

		
		
		
		

}