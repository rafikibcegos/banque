package org.formation.controller;

import java.util.List;


import org.formation.entity.Conseiller;

import org.formation.repository.ConseillerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conseillers")
@CrossOrigin(origins = {"http://localhost:4200"})
public class RestConseillerContoller {

	

	
	@Autowired
	ConseillerRepository conseillerRepository;
	
	
	@GetMapping
	public List<Conseiller> getConseillers() {
		return conseillerRepository.findAll();
	}

	

	@GetMapping("/{id}")
	public Conseiller getConseiller(@PathVariable("id") Long id) {
		return conseillerRepository.findById(id).get();

	}

}
