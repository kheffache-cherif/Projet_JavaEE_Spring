package com.Office_Tourisme.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Office_Tourisme.model.Lieu;

public interface LieuRepository extends JpaRepository<Lieu, String> {

}