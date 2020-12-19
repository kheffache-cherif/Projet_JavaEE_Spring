package com.Office_Tourisme.Service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.Office_Tourisme.dao.IMonumentDao;
import com.Office_Tourisme.model.Monument;

@Transactional
public class MonumentServiceImpl implements IMonumentService{
	
	private IMonumentDao dao;

	public void setDao(IMonumentDao dao) {
		this.dao = dao;
	}

	public void addMonument(Monument m) {
		dao.addMonument(m);
		
	}

	public List<Monument> listMonument() {
		// TODO Auto-generated method stub
		return dao.listMonument();
	}

	public Monument getMonument(String codeM) {
		// TODO Auto-generated method stub
		return dao.getMonument(codeM);
	}

	public void deleteMonument(String codeM) {
		dao.deleteMonument(codeM);		
	}

	public void updateMonument(Monument m) {
		dao.updateMonument(m);
	}

}
