package com.Office_Tourisme.Repo;




import org.springframework.data.jpa.repository.JpaRepository;

import com.Office_Tourisme.model.Celebrite;


public interface CelebriteRepository extends JpaRepository<Celebrite, Integer> {
	
}
