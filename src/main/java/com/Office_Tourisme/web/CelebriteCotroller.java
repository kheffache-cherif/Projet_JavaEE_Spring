package com.Office_Tourisme.web;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Office_Tourisme.Service.ICelebriteService;
import com.Office_Tourisme.model.Celebrite;

@Controller// c'est un stereotype
public class CelebriteCotroller {
	
	
	@Autowired  // injecter l'instanciation de ICelebriteService et avoir l'accer à toute les methodes 
	ICelebriteService celebriteService;
	
	@RequestMapping("/showCreate")  //@..lorsque l'url demander est celui la don c j'affiche la jsp
	public String showCreate(ModelMap modelMap) throws ParseException
	{
		
		modelMap.addAttribute("mode", "new");
		return "formCelebrite";// le nom de la vue creer
	}
	@RequestMapping("/saveCelebrite")  // action save celebrite
	public String saveCelebrite(@ModelAttribute("celebrite") Celebrite celebrite, // lors de la creation de la vue du il recupere l'objet 
							
							  ModelMap modelMap) throws ParseException
	{
		
      
		Celebrite saveCelebrite = celebriteService.saveCelebrite(celebrite);  //la methode save du service avec comme paramettre l'objet celeb
		 String msg ="clebrite enregistré avec Id "+saveCelebrite.getNumCelebrite();
		 modelMap.addAttribute("msg", msg); //je passe le message à modelMap declarer en haut 
			modelMap.addAttribute("mode", "new");
		 return "formCelebrite";
		
	}
		
		@RequestMapping("/ListeCelebrites")
		public String listeCelebrites(ModelMap modelMap,
		@RequestParam (name="page",defaultValue = "0") int page,
		@RequestParam (name="size", defaultValue = "2") int size)
		{
			//List<Celebrite>celebs = celebriteService.getAllCelebrites();
			//modelMap.addAttribute("celebrites", celebs);		
			//return "ListeCelebrites";	
			
			Page<Celebrite> celebs = celebriteService.getAllCelebritesParPage(page, size);
			modelMap.addAttribute("celebrites", celebs);		
			modelMap.addAttribute("pages", new int[celebs.getTotalPages()]);	
			modelMap.addAttribute("currentPage", page);	
			return "listeCelebrites";
		}
		
		
		@RequestMapping("/supprimerCelebrite")
		@PreAuthorize("hasRole('ROLE_ADMIN')")
		public String supprimerCelebrite(@RequestParam("id") Integer id,
				ModelMap modelMap,
				@RequestParam (name="page",defaultValue = "0") int page,
				@RequestParam (name="size", defaultValue = "2") int size)
		{
			//Celebrite c = new Celebrite();
			//c.setNumCelebrite(id);
			celebriteService.deleteCelebriteById(id);
			
			Page<Celebrite> celebs = celebriteService.getAllCelebritesParPage(page, size);
			modelMap.addAttribute("celebrites", celebs);		
			modelMap.addAttribute("pages", new int[celebs.getTotalPages()]);	
			modelMap.addAttribute("currentPage", page);	
			modelMap.addAttribute("size", size);	
			return "listeCelebrites";	
		}
		
		@RequestMapping("/modifierCelebrite")
		@PreAuthorize("hasRole('ROLE_ADMIN')")
		public String editerCelebrite(@RequestParam("id") Integer id,
				ModelMap modelMap)
		{
			Celebrite c= celebriteService.getCelebrite(id);
			modelMap.addAttribute("celebrite", c);	
			modelMap.addAttribute("mode", "edit");	
			return "formCelebrite";	
		}

		@RequestMapping("/updateCelebrite")
		@PreAuthorize("hasRole('ROLE_ADMIN')")
		public String updateCelebrite(@ModelAttribute("celebrite") Celebrite celebrite,
				                    ModelMap modelMap) {
			 celebriteService.updateCelebrite(celebrite);
			 List<Celebrite>celebs = celebriteService.getAllCelebrites();
				modelMap.addAttribute("celebrites", celebs);		
				return "ListeCelebrites";
			
			
		}
			
		
}
