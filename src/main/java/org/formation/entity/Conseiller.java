package org.formation.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

@Entity
public class Conseiller extends Personne {
	
	
private String login;
	
	private String motDePasse;
	
	@Embedded
	private Adresse adresse;

	public Conseiller() {
		
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
		return "Conseiller [login=" + login + ", motDePasse=" + motDePasse + ", adresse=" + adresse + "]";
	}
	
	
	
	

}
