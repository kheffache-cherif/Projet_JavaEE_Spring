package com.Office_Tourisme.Controllers;



import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Office_Tourisme.Service.IMonumentService;
import com.Office_Tourisme.model.Monument;


@Controller// c'est un stereotype
public class MonumentController {
	@ Autowired
	IMonumentService iMonumentService;
	
	
	@RequestMapping("/showCreateM")  //@..lorsque l'url demander est celui la don c j'affiche la jsp
	public String showCreate()
	{
		return "CreateMonument";// le nom de la vue creer
	}
	@RequestMapping("/saveMonument")  // action save monument
	public String saveMonument(@ModelAttribute("monument") Monument monument, // lors de la creation de la vue du il recupere l'objet 
							
							  ModelMap modelMap) throws ParseException
	{
		
      
		Monument saveMonument = iMonumentService.saveMonument(monument);  //la methode save du service avec comme paramettre l'objet celeb
		 String msg ="monument enregistré avec codeM "+saveMonument.getCodeM();
		 modelMap.addAttribute("msg", msg); //je passe le message à modelMap declarer en haut 
		return "CreateMonument";
		
	}
		
		@RequestMapping("/ListeMonuments")
		public String listeMonuments(ModelMap modelMap,
		@RequestParam (name="page",defaultValue = "0") int page,
		@RequestParam (name="size", defaultValue = "2") int size)
		{
			//List<Monument>mnmts = monumentService.getAllMonuments();
			//modelMap.addAttribute("monuments", mnmts);		
			//return "ListeMonuments";	
			
			Page<Monument> mnmts = iMonumentService.getAllMonumentsParPage(page, size);
			modelMap.addAttribute("monuments", mnmts);		
			modelMap.addAttribute("pages", new int[mnmts.getTotalPages()]);	
			modelMap.addAttribute("currentPage", page);	
			return "listeMonuments";
		}
		
		
		@RequestMapping("/supprimerMonument")
		public String supprimerMonument(@RequestParam("id") String id,
				ModelMap modelMap,
				@RequestParam (name="page",defaultValue = "0") int page,
				@RequestParam (name="size", defaultValue = "2") int size)
		{
			//Monument c = new Monument();
			//c.setNumMonument(id);
			iMonumentService.deleteMonumentById(id);
			
			Page<Monument> mnmts = iMonumentService.getAllMonumentsParPage(page, size);
			modelMap.addAttribute("monuments", mnmts);		
			modelMap.addAttribute("pages", new int[mnmts.getTotalPages()]);	
			modelMap.addAttribute("currentPage", page);	
			modelMap.addAttribute("size", size);	
			return "listeMonuments";	
		}
		
		@RequestMapping("/modifierMonument")
		public String editerMonument(@RequestParam("id") String id,
				ModelMap modelMap)
		{
			Monument m= iMonumentService.getMonument(id);
			modelMap.addAttribute("monument", m);	
			return "editerMonument";	
		}

		@RequestMapping("/updateMonument")
		public String updateMonument(@ModelAttribute("monument") Monument monument,
				                    ModelMap modelMap) {
			 iMonumentService.updateMonument(monument);
			 List<Monument>mnmts = iMonumentService.getAllMonuments();
				modelMap.addAttribute("monuments", mnmts);		
				return "ListeMonuments";
			
			
		}
		

}
