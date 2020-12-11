package com.Office_Tourisme.model;
	import java.io.Serializable;
	import java.util.Collection;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;



	@Entity
	
	@Table(name = "departement")
	public class Departement implements Serializable {
		
		@Id
		@Column (name= "dep",length=4)
		private String dep;
		
		//un departement a un chef lieu
		@Column (name= "chef_lieu", length=46)
		private String chef_lieu;  //Lieu
			
		@Column (name= "nom_dep", length=30)
		private String nom_dep;
		
		@Column (name= "numreg", length=4)
		private String num_reg;
		
		
	     /*OnetoMany car un departement peut avoir plusieur lieux
	      * departement attribut dans class lieu
	      * le mode lazy qui va etre utiliser pour gerer les association entre les classe
	      * */
		@OneToMany(mappedBy ="departements", fetch=FetchType.LAZY)  //sans mappedBy on aura une table intermediaire
		private Collection<Lieu> lieux;


		
		/*--------------------------------Constructeurs---------------------------------------------------------------*/
		public Departement() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Departement(String dep, String chef_lieu, String nom_dep, String num_reg) {
			super();
			this.dep = dep;
			this.chef_lieu = chef_lieu;
			this.nom_dep = nom_dep;
			this.num_reg = num_reg;
		
		}

			/*--------------------------------------------Getters/Setters--------------------------------------------------*/
		public String getDep() {
			return dep;
		}


		public void setDep(String dep) {
			this.dep = dep;
		}


		public String getChef_lieu() {
			return chef_lieu;
		}


		public void setChef_lieu(String chef_lieu) {
			this.chef_lieu = chef_lieu;
		}


		public String getNom_dep() {
			return nom_dep;
		}


		public void setNom_dep(String nom_dep) {
			this.nom_dep = nom_dep;
		}


		public String getNum_reg() {
			return num_reg;
		}


		public void setNum_reg(String num_reg) {
			this.num_reg = num_reg;
		}


		public Collection<Lieu> getLieux() {
			return lieux;
		}


		public void setLieux(Collection<Lieu> lieux) {
			this.lieux = lieux;
		}
		
		
		
		
		
}