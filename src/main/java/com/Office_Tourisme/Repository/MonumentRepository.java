package com.Office_Tourisme.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Office_Tourisme.model.Monument;

public interface MonumentRepository extends JpaRepository<Monument, String> {

}
