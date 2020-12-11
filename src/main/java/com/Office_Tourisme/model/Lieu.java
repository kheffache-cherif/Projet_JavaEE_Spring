package com.Office_Tourisme.model;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Fetch;


@Entity
public class Lieu implements Serializable{
	
	private static final long serialVersionUID = -5932571284160960204L;
	
	@Id
	private String codeInsee;	
	private String nomCom;
	private double longitude;
	private double latitude;
	
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Departement.class)
	@JoinColumn(name="depL")
	private Departement depL;
	
	@OneToMany(targetEntity = Monument.class, mappedBy = "codeLieu", fetch=FetchType.EAGER)
	@Fetch (FetchMode.SELECT)
	private List<Monument> monuments = new ArrayList<Monument>();
	
	
	public Lieu() {
	}

	
	public String getCodeInsee() {
		return codeInsee;
	}
	public void setCodeInsee(String codeInsee) {
		this.codeInsee = codeInsee;
	}
	
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	
	public Departement getDepL() {
		return depL;
	}
	
	public void setDepL(Departement depL) {
		this.depL = depL;
	}
	
	public List<Monument> getMonuments(){
        return monuments;
        }

	public void setMonuments(List<Monument> monuments) {
            this.monuments = monuments;
    }
	
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	

	@Override
	public String toString() {
		return "Lieu [codeInsee=" + codeInsee + ", nomCom=" + nomCom + ", longitude=" + longitude + ", latitude="
				+ latitude + "]";
	}


	public Monument addMonument(Monument monument) {
    	monuments.add(monument);
    	monument.setLieu(this);
        return monument;
    }
	
	public Monument removeMonument(Monument monument) {
    	monuments.remove(monument);
        return monument;
    }

}


