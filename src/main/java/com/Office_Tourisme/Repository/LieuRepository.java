package com.Office_Tourisme.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Office_Tourisme.model.Lieu;


public interface LieuRepository extends JpaRepository<Lieu, String> {
	

	List<Lieu> findByCodeInseeContains(String CodeInsee);
	Page<Lieu> findByCodeInseeContains(String CodeInsee, Pageable pageable);

	List<Lieu> findByCodeInsee(String CodeInsee);

}
