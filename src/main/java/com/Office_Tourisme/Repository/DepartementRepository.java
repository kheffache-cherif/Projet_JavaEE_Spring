package com.Office_Tourisme.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Office_Tourisme.model.Departement;

public interface DepartementRepository extends JpaRepository<Departement, String> {

}
