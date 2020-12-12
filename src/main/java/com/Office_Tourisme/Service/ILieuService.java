package com.Office_Tourisme.Service;
import java.util.List;

import com.Office_Tourisme.model.Lieu;



public interface ILieuService {
	
	public List<Lieu> listLieu();
	public Lieu getLieu(String codeInsee);

}
