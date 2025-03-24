package demo;

import demo.service.BanqueService;
import demo.service.ServiceResponseDTO;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	BanqueService banqueService;

	@Test
	void contextLoads(){
	}

	@Test
	void RG_11515() {
		// cas 789
		ServiceResponseDTO responseDTO789 = banqueService.debit(6000);
		assertEquals("789", responseDTO789.code);

		// cas 207
		ServiceResponseDTO responseDTO207 = banqueService.debit(2000);
		assertEquals("207", responseDTO207.code);

	}



}
