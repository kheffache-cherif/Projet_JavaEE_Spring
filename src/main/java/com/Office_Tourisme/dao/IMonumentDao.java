package com.Office_Tourisme.dao;


import java.util.List;

import com.Office_Tourisme.model.Monument;



public interface IMonumentDao {
	
	public void addMonument(Monument m);
	public List<Monument> listMonument();
	public Monument getMonument(String codeM);
	public void deleteMonument(String codeM);
	public void updateMonument(Monument m);

	

}
