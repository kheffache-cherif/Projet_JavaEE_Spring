package com.Office_Tourisme;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import java.util.List;

import com.Office_Tourisme.Repository.CelebriteRepository;
import com.Office_Tourisme.Repository.MonumentRepository;
import com.Office_Tourisme.Service.ICelebriteService;
import com.Office_Tourisme.Service.IMonumentService;
//import com.Office_Tourisme.Repository.CelebriteRepository;
import com.Office_Tourisme.model.Celebrite;
import com.Office_Tourisme.model.Monument;


@SpringBootTest
class OfficeDeTourismeApplicationTests {

	
	@Autowired   // pour que spring injecte cet objet de type repository
	private CelebriteRepository celebriteRepository; // declaration objet de type de notre interface 
	private ICelebriteService celebriteService;
	
	@Autowired 
	private MonumentRepository monumentRepository;
	private IMonumentService iMonumentService;
	@Test
	public void testCreationCelebrite() {
		Celebrite cel1 = new  Celebrite(25, "Fabre", "François-Xavier", "Française", "18ème");
		
		celebriteRepository.save(cel1);  // Jpa repository fourni toute les methodes necessaire 
	}
	
	@Test
	public void testFindCelebrite() {
		Celebrite c = celebriteRepository.findById(25).get();
		System.out.println(c);
	
	}
	
	@Test
	public void testUpdateCelebrite() {
		Celebrite c = celebriteRepository.findById(25).get();
		c.setEpoque("19ème");
		celebriteRepository.save(c);
		System.out.println(c);
	}
	
	@Test
	public void testDeleteCelebrite() {
		celebriteRepository.deleteById(25);
		
	}
	


	@Test
	public void testFindAllCelebrite() {
		List<Celebrite> celebs = celebriteRepository.findAll();
	
		for (Celebrite c:celebs)
			System.out.println(c);
	}
	

	
/*	@Test
	public void testFindByNomContains()
	 {
		Page<Celebrite>  celebs = celebriteService.getAllCelebritesParPage(0,2);
		System.out.println(celebs.getSize());
		System.out.println(celebs.getTotalElements());
		System.out.println(celebs.getTotalPages());
		
		celebs.getContent().forEach(c -> {System.out.println(c.toString());
		                               
		                         });	
		
		ou bien
		 for (Celebrite c : celebs)
		{
			System.out.println(p);
		} */
	/*------------------------------------------Monument---------------------------------------*/

				
	/*
	 * @Test public void testcreationMonument(){ Monument mon2 = new Monument("sdf",
	 * "hgfs", "dfgh", "dfgh", 456.8, 4562); monumentRepository.save(mon2); }
	 */
	
	
	@Test
	public void testFindMonument() {
		Monument m = monumentRepository.findById("sdf").get();
		System.out.println(m);
	}
	
	@Test
	public void testFindAllMonuments() {
		List<Monument> mnmts = monumentRepository.findAll();
	
		for (Monument m:mnmts)
			System.out.println(m);
	}
	
}


	

