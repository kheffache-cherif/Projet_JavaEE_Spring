package com.Office_Tourisme.web;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Office_Tourisme.Service.IDepartementService;


import com.Office_Tourisme.model.Departement;

@Controller
public class DepartemntController {

	@Autowired  // injecter l'instanciation de IDepartementService et avoir l'accer à toute les methodes 
	IDepartementService iDepartementService;
	
	@RequestMapping("/showCreateD")  //@..lorsque l'url demander est celui la don c j'affiche la jsp
	public String showCreate(ModelMap modelMap) throws ParseException
	{
		modelMap.addAttribute("mode", "new");
		return "formDepartement";// le nom de la vue creer
	}
	@RequestMapping("/saveDepartement")  // action save Departement
	public String saveDepartement(@ModelAttribute("departement") Departement departement, // lors de la creation de la vue du il recupere l'objet 
							
							  ModelMap modelMap) throws ParseException
	{
		
      
		Departement saveDepartement = iDepartementService.saveDepartement(departement);  //la methode save du service avec comme paramettre l'objet celeb
		 String msg ="clebrite enregistré avec Id "+saveDepartement.getDep();
		 modelMap.addAttribute("msg", msg); //je passe le message à modelMap declarer en haut 
			modelMap.addAttribute("mode", "new");
		 return "formDepartement";
		
	}
		
		@RequestMapping("/ListeDepartements")
		public String listeDepartements(ModelMap modelMap,
		@RequestParam (name="page",defaultValue = "0") int page,
		@RequestParam (name="size", defaultValue = "2") int size)
		{
			//List<Departement>depts = DepartementService.getAllDepartements();
			//modelMap.addAttribute("Departements", depts);		
			//return "ListeDepartements";	
			
			Page<Departement> depts = iDepartementService.getAllDepartementsParPage(page, size);
			modelMap.addAttribute("departements", depts);		
			modelMap.addAttribute("pages", new int[depts.getTotalPages()]);	
			modelMap.addAttribute("currentPage", page);	
			return "listeDepartements";
		}
		
		
		@RequestMapping("/supprimerDepartement")
		public String supprimerDepartement(@RequestParam("id") String id,
				ModelMap modelMap,
				@RequestParam (name="page",defaultValue = "0") int page,
				@RequestParam (name="size", defaultValue = "2") int size)
		{
			//Departement c = new Departement();
			//c.setNumDepartement(id);
			
			 iDepartementService.deleteDepartementById(id);
			
			Page<Departement> depts = iDepartementService.getAllDepartementsParPage(page, size);
			modelMap.addAttribute("departements", depts);		
			modelMap.addAttribute("pages", new int[depts.getTotalPages()]);	
			modelMap.addAttribute("currentPage", page);	
			modelMap.addAttribute("size", size);	
			return "listeDepartements";	
		}
		
		@RequestMapping("/modifierDepartement")
		public String editerDepartement(@RequestParam("id") String id,
				ModelMap modelMap)
		{
		
			Departement d = iDepartementService.getDepartement(id);
			modelMap.addAttribute("departement", d);	
			modelMap.addAttribute("mode", "edit");	
			return "formDepartement";	
		}

		@RequestMapping("/updateDepartement")
		public String updateDepartement(@ModelAttribute("departement") Departement departement,
				                    ModelMap modelMap) {
			 iDepartementService.updateDepartement(departement);
			 List<Departement>depts = iDepartementService.getAllDepartements();
				modelMap.addAttribute("departements", depts);		
				return "ListeDepartements";
			
			
		}
			
		
}
