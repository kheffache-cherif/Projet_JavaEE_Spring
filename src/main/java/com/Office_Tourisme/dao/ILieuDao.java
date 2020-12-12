package com.Office_Tourisme.dao;


import java.util.List;

import com.Office_Tourisme.model.Lieu;


public interface ILieuDao {
	
	public List<Lieu> listLieu();
	public Lieu getLieu(String codeInsee);

}
