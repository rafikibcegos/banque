package org.formation.controller;

import java.util.List;

import org.formation.entity.Compte;
import org.formation.entity.Conseiller;
import org.formation.repository.CompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listcomptes")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RestCompteController {
	
	
	
	
	@Autowired
	CompteRepository compteRepository;
	
	
	
	@GetMapping
	public List<Compte> getComptes() {
		return compteRepository.findAll();
	}
	
	
	
	@GetMapping("/{id}")
	public Compte getCompte(@PathVariable("id") Long id) {
		return compteRepository.findById(id).get();

	}

	
	
	
	
	
	
	
	
	
	

}
