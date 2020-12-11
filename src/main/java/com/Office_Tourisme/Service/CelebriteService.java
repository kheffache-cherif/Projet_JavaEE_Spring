package com.Office_Tourisme.Service;

import java.util.List;

import com.Office_Tourisme.model.Celebrite;

public interface CelebriteService {
	
	Celebrite saveCelebrite(Celebrite c);
	Celebrite updaCelebrite(Celebrite c);
	void deleteCelebrite(Celebrite c);
	void deleteCelebriteById(Integer id);
	
	Celebrite getCelebrite(Integer id);
	List<Celebrite> getAllCelebrite();
	
	

}
