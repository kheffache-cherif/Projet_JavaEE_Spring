package com.Office_Tourisme.Repo;




import org.springframework.data.domain.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Office_Tourisme.model.Celebrite;

public interface CelebriteRepository extends JpaRepository<Celebrite, Integer> {

	List<Celebrite> findByNom(String nom);

	List<Celebrite> findByNomContains(String nom);
	Page<Celebrite> findByNomContains(String nom, Pageable pageable); 
	
}
