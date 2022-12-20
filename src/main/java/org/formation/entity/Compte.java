package org.formation.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	
	
 private int numeroCompte;




private Date dateOuverture;
private float solde;





public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public Compte() {
	
	
}



public int getNumeroCompte() {
	return numeroCompte;
}



public void setNumeroCompte(int numeroCompte) {
	this.numeroCompte = numeroCompte;
}



public Date getDateOuverture() {
	return dateOuverture;
}



public void setDateOuverture(Date dateOuverture) {
	this.dateOuverture = dateOuverture;
}



public float getSolde() {
	return solde;
}



public void setSolde(float solde) {
	this.solde = solde;
}





public Compte(Long id, int numeroCompte, Date dateOuverture, float solde) {
	super();
	this.id = id;
	this.numeroCompte = numeroCompte;
	this.dateOuverture = dateOuverture;
	this.solde = solde;
}



@Override
public String toString() {
	return "Compte [id=" + id + ", numeroCompte=" + numeroCompte + ", dateOuverture=" + dateOuverture + ", solde="
			+ solde + "]";
}
























	
	
	
	
}
	
	
	
	


