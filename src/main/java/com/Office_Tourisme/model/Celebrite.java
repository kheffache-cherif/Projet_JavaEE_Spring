package com.Office_Tourisme.model;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity // JPA pour la notation Entity    Maping relationnel
@Table(name = "Celebrite")  // juste pour donner un nom à cette table facultatif
public class Celebrite implements Serializable{
	
	
	@Id /* pour spécifier identifiant et si il est generer */
	@Column (name= "num_Celebrite")
	private Integer num_Celebrite;
	
	@Column (name = "epoque", length = 6)
	private String epoque;
	
	@Column (name = "nationalite", length = 10)
	private String nationalite ;
	
	@Column (name = "nom",length = 16)
	private String  nom;
	
	@Column (name = "prenom", length = 16)
	private String prenom;
	
	
	/* assoction car  celebrites peut avoir plusieur monument
	/* mappedBy car c'est une association bidiractionnelle
	 * apres on va spécifier dans la classe mMonument est representer par attribut monument
	 * fetch: Lazy c'est mode qui va etre utiliser pour gerer les associations entre class   */
	@ManyToMany(mappedBy = "celebrites",fetch=FetchType.LAZY)
	private Collection<Monument> monuments;

	
	
	
	/*-------------------- Constructeurs  -------------------------*/

	public Celebrite() {
		super();
	}


	public Celebrite(Integer num_Celebrite, String epoque, String nationalite, String nom, String prenom) {
		super();
		this.num_Celebrite = num_Celebrite;
		this.epoque = epoque;
		this.nationalite = nationalite;
		this.nom = nom;
		this.prenom = prenom;
	
	}


	/*-------------------- gueters setters--------------------*/

	public Integer getNum_Celebrite() {
		return num_Celebrite;
	}


	public void setNum_Celebrite(Integer num_Celebrite) {
		this.num_Celebrite = num_Celebrite;
	}


	public String getEpoque() {
		return epoque;
	}


	public void setEpoque(String epoque) {
		this.epoque = epoque;
	}


	public String getNationalite() {
		return nationalite;
	}


	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
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


	public Collection<Monument> getMonuments() {
		return monuments;
	}


	public void setMonuments(Collection<Monument> monuments) {
		this.monuments = monuments;
	}


	@Override
	public String toString() {
		return "Celebrite [num_Celebrite=" + num_Celebrite + ", epoque=" + epoque + ", nationalite=" + nationalite
				+ ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	
	
}


