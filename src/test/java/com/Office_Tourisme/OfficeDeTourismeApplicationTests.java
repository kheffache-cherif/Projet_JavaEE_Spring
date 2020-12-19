package com.Office_Tourisme;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

//import com.Office_Tourisme.Repository.CelebriteRepository;
import com.Office_Tourisme.model.Celebrite;


@SpringBootTest
class OfficeDeTourismeApplicationTests {
/*
	
	@Autowired   // pour que spring injecte cet objet de type repository
	private CelebriteRepository celebriteRepository; // declaration objet de type de notre interface 
	@Test
	public void testCreationCelebrite() {
		Celebrite cel1 = new Celebrite(256, "19ème", "Françaisejhjj", "Figiur","loui");
		
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
		c.setEpoque("18ème");
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
	*/
}
