package com.Office_Tourisme.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Office_Tourisme.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, String> {

}