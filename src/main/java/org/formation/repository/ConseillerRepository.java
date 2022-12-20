package org.formation.repository;

import java.util.List;


import org.formation.entity.Conseiller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConseillerRepository extends JpaRepository<Conseiller, Long> {
	
	
	List<Conseiller> findByNom(String nom);
	List<Conseiller> findByLogin(String login);

}
