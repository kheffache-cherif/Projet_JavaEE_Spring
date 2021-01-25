package com.Office_Tourisme.model;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Fetch;


@Entity
@Table(name = "lieu")
public class Lieu implements Serializable{
	
	private static final long serialVersionUID = -5932571284160960204L;
	
	@Id
	private String codeInsee;	
	private String nomCom;
	private float longitude;
	private float latitude;
	
	@ManyToOne
	@JoinColumn(name ="dep", referencedColumnName="dep")
	private Departement dep;
	
	@OneToMany(mappedBy = "codeLieu", fetch = FetchType.LAZY)
	private List<Monument> monuments= new ArrayList<Monument>();	
	
	public Lieu() {
	}
	
	
	

	
	public void setDep(Departement dep) {
		this.dep = dep;
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
	
	public Departement getDep() {
		return dep;
	}
	
	public void setDepL(Departement dep) {
		this.dep = dep;
	}
	
	public List<Monument> getMonuments(){
        return monuments;
        }

	public void setMonuments(List<Monument> monuments) {
            this.monuments = monuments;
    }
	
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	

	@Override
	public String toString() {
		return "Lieu [codeInsee=" + codeInsee + ", nomCom=" + nomCom + ", longitude=" + longitude + ", latitude="
				+ latitude + "]";
	}


	public Monument addMonument(Monument monument) {
    	monuments.add(monument);
    	monument.setCodeLieu(this);
        return monument;
    }
	
	public Monument removeMonument(Monument monument) {
    	monuments.remove(monument);
        return monument;
    }

}


