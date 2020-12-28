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

import com.Office_Tourisme.Service.ILieuService;
import com.Office_Tourisme.model.Lieu;


@Controller
public class LieuController {
	
	
	@ Autowired
	ILieuService iLieuService;
	
	
	@RequestMapping("/showCreateL")  //@..lorsque l'url demander est celui la don c j'affiche la jsp
	public String showCreate()
	{
		return "CreateLieu";// le nom de la vue creer
	}
	@RequestMapping("/saveLieu")  // action save Lieu
	public String saveLieu(@ModelAttribute("lieu") Lieu lieu, // lors de la creation de la vue du il recupere l'objet 
							
							  ModelMap modelMap) throws ParseException
	{
		
      
		Lieu saveLieu = iLieuService.saveLieu(lieu);  //la methode save du service avec comme paramettre l'objet celeb
		 String msg ="Lieu enregistré avec codeM "+saveLieu.getCodeInsee();
		 modelMap.addAttribute("msg", msg); //je passe le message à modelMap declarer en haut 
		return "CreateLieu";
		
	}
		
		@RequestMapping("/ListeLieux")
		public String listeLieus(ModelMap modelMap,
		@RequestParam (name="page",defaultValue = "0") int page,
		@RequestParam (name="size", defaultValue = "2") int size)
		{
			//List<Lieu>lieux = LieuService.getAllLieus();
			//modelMap.addAttribute("Lieus", lieux);		
			//return "ListeLieus";	
			
			Page<Lieu> lieux = iLieuService.getAllLieuxParPage(page, size);
			modelMap.addAttribute("lieux", lieux);		
			modelMap.addAttribute("pages", new int[lieux.getTotalPages()]);	
			modelMap.addAttribute("currentPage", page);	
			return "listeLieux";
		}
		
		
		@RequestMapping("/supprimerLieu")
		public String supprimerLieu(@RequestParam("id") String id,
				ModelMap modelMap,
				@RequestParam (name="page",defaultValue = "0") int page,
				@RequestParam (name="size", defaultValue = "2") int size)
		{
			//Lieu c = new Lieu();
			//c.setCodInsee(id);
			iLieuService.deleteLieuById(id);
			
			Page<Lieu> lieux = iLieuService.getAllLieuxParPage(page, size);
			modelMap.addAttribute("lieux", lieux);		
			modelMap.addAttribute("pages", new int[lieux.getTotalPages()]);	
			modelMap.addAttribute("currentPage", page);	
			modelMap.addAttribute("size", size);	
			return "listeLieux";	
		}
		
		@RequestMapping("/modifierLieu")
		public String editerLieu(@RequestParam("id") String id,
				ModelMap modelMap)
		{
			Lieu l= iLieuService.getLieu(id);
			modelMap.addAttribute("lieux", l);	
			return "editerLieu";	
		}

		@RequestMapping("/updateLieu")
		public String updateLieu(@ModelAttribute("Lieu") Lieu lieu,
				                    ModelMap modelMap) {
			 iLieuService.updateLieu(lieu);
			 List<Lieu>lieux = iLieuService.getAllLieux();
				modelMap.addAttribute("lieux", lieux);		
				return "ListeLieux";
			
			
		}
		


}
