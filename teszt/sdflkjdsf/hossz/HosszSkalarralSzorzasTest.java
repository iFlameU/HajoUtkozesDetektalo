package sdflkjdsf.hossz;

import static org.junit.Assert.*;

import org.junit.Test;

import sdflkjdsf.Hossz;
import sdflkjdsf.Hossz.ME;

public class HosszSkalarralSzorzasTest {

	@Test
	public void testSkalarralSzorzasVisszateritettErtekHosszTipusu(){
		Hossz hossz = new Hossz(120, ME.cm);
		assertTrue(hossz.skalarralSzorzas(2) instanceof Hossz);
	}
	
	@Test
	public void testSkalarSzorzasVisszateritettErtekMegfeleloErteku(){
		Hossz hossz = new Hossz(1, ME.cm);
		assertEquals(3.5, hossz.skalarralSzorzas(3.5).get(ME.cm), 0);
	}

}
