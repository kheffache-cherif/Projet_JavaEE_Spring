package com.Office_Tourisme.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.Office_Tourisme.model.Departement;


public interface DepartementRepository extends JpaRepository<Departement, String> {

	
	List<Departement> findByDep(String dep );

	List<Departement> findByDepContains(String dep);
	Page<Departement> findByDepContains(String dep, Pageable pageable);
}
