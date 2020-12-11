package com.Office_Tourisme.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Departement implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1935143767958645073L;
	
	@Id
	private String dep;
	private String chefLieu;
	private String nomDep;
	private String reg;
	
	@OneToMany(targetEntity = Lieu.class, mappedBy = "depL", fetch=FetchType.EAGER)
	private List<Lieu> lieux = new ArrayList<Lieu>();
	
	
	
	public Departement() {
	}



	public String getDep() {
		return dep;
	}


	public void setDep(String dep) {
		this.dep = dep;
	}


	public String getChefLieu() {
		return chefLieu;
	}


	public void setChefLieu(String chefLieu) {
		this.chefLieu = chefLieu;
	}


	public String getNomDep() {
		return nomDep;
	}


	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}


	public String getReg() {
		return reg;
	}


	public void setReg(String reg) {
		this.reg = reg;
	}


	public List<Lieu> getLieux() {
		return lieux;
	}


	public void setLieux(List<Lieu> lieux) {
		this.lieux = lieux;
	}



	@Override
	public String toString() {
		return "Departement [dep=" + dep + ", chefLieu=" + chefLieu + ", nomDep=" + nomDep + ", reg=" + reg + "]";
	}


	public Lieu addLieu(Lieu lieu) {
		lieux.add(lieu);
		lieu.setDepL(this);
        return lieu;
    }
	
	public Lieu removeLieu(Lieu lieu) {
		lieux.remove(lieu);
        return lieu;
    }
	

}
