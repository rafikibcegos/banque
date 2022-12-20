 package org.formation.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class Client extends Personne  {
	
	private String login;
	
	private String motDePasse;
	
	@Embedded
	private Adresse adresse;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "compte_id", referencedColumnName = "id")
    private Compte compte;

	public Client() {}

	public Client(Adresse adresse) {
	    this.adresse = adresse;
	}
	




	
	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Client(String login, String motDePasse, Adresse adresse, Compte compte) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
		this.adresse = adresse;
		this.compte = compte;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Client [login=" + login + ", motDePasse=" + motDePasse + ", adresse=" + adresse + ", compte=" + compte
				+ "]";
	}
	

  
}
