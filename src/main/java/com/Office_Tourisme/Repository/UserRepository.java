package com.Office_Tourisme.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Office_Tourisme.model.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>{  //JpA pour acceder à CRUD database
	User findByEmail(String email);
}