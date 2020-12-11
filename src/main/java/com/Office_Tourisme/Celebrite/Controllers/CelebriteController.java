package com.Office_Tourisme.Celebrite.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Office_Tourisme.Service.CelebriteService;

@Controller // c''est un styriotype
public class CelebriteController {
	
	@Autowired
	CelebriteService celebriteService;
	
	@RequestMapping("/showCreate")  //lorque url demander par le clien est ....je retourn creat celebrite
	public String showCreat() {
		return "createCelebrite";
	}

}
