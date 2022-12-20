package org.formation.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name = "compte")
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	
	
	
 private int numeroCompte;


 @OneToOne(mappedBy = "compte")
 private Client client;

private Date dateOuverture;
private float solde;





public Client getClient() {
	return client;
}



public void setClient(Client client) {
	this.client = client;
}



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



public Compte(Long id, int numeroCompte, Client client, Date dateOuverture, float solde) {
	super();
	this.id = id;
	this.numeroCompte = numeroCompte;
	this.client = client;
	this.dateOuverture = dateOuverture;
	this.solde = solde;
}



@Override
public String toString() {
	return "Compte [id=" + id + ", numeroCompte=" + numeroCompte + ", client=" + client + ", dateOuverture="
			+ dateOuverture + ", solde=" + solde + "]";
}




























	
	
	
	
}
	
	
	
	


