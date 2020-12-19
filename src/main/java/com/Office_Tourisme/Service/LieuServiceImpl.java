package com.Office_Tourisme.Service;

import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import com.Office_Tourisme.dao.ILieuDao;
import com.Office_Tourisme.model.Lieu;

@Transactional
public class LieuServiceImpl implements ILieuService{
	
	private ILieuDao daol;

	public void setDaol(ILieuDao dao) {
		this.daol = dao;
	}

	public List<Lieu> listLieu() {
		return daol.listLieu();
	}

	public Lieu getLieu(String codeInsee) {
		return daol.getLieu(codeInsee);
	}


}
