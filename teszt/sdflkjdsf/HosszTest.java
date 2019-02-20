package sdflkjdsf;

import static org.junit.Assert.*;

import org.junit.Test;

public class HosszTest {

	@Test
	public void testLetrehozas() throws WrongMeException {
		assertNotNull(new Hossz(120, "m"));
	}
	

	@Test(expected = WrongMeException.class)
	public void testLetrehozasRosszME() throws WrongMeException {
		new Hossz(1, "köpés");
	}

}
