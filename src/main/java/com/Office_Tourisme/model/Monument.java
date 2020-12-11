package com.Office_Tourisme.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


@Entity
public class Monument implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3825993248842249538L;
	
	@Id
	private String codeM;
	private String nomM;
	private String proprietaire;
	private String typeMonument;
	private double longitude;
	private double latitude;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Lieu.class)
	@JoinColumn(name="codeLieu")
	private Lieu codeLieu;
	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="monuments")
	private Set<Celebrite> celebrites; 
	

	public Monument() {
	}

	
	public String getCodeM() {
		return codeM;
	}
	public void setCodeM(String codeM) {
		this.codeM = codeM;
	}
	
	public String getNomM() {
		return nomM;
	}
	public void setNomM(String nomM) {
		this.nomM = nomM;
	}
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="CODELIEU")
	public Lieu getLieu() {
		return codeLieu;
	}
	
	public void setLieu(Lieu codeLieu) {
		this.codeLieu = codeLieu;
	}
	
	public String getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	public String getTypeMonument() {
		return typeMonument;
	}
	public void setTypeMonument(String typeMonument) {
		this.typeMonument = typeMonument;
	}	
	
	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Monument [codeM=" + codeM + ", nomM=" + nomM + ", proprietaire=" + proprietaire + ", typeMonument="
				+ typeMonument + ", longitude=" + longitude + ", latitude=" + latitude + ", codeLieu=" + codeLieu
				+ ", celebrites=" + celebrites + "]";
	}
	
	
	public Set<Celebrite> getCelebrites(){  
	    return celebrites;  
	}  
	public void setCelebrites(Set<Celebrite> celebrites){  
	    this.celebrites = celebrites;  
	}  
	
	
}

	