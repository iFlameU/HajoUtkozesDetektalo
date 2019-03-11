package sdflkjdsf.hossz;

import static org.junit.Assert.*;

import org.junit.Test;

import sdflkjdsf.Hossz;
import sdflkjdsf.Hossz.ME;

public class HosszNegalasTest {

	@Test
	public void testNegalasVisszateritettErtekHosszTipusu() {
		Hossz hossz = new Hossz(120, ME.cm);
		assertTrue(hossz.negate() instanceof Hossz);
	}
	
	@Test
	public void testNegalasVisszateritettErtekMegfeleloErteku() {
		Hossz hossz = new Hossz(120, ME.cm);
		assertEquals(-120, hossz.negate().get(ME.cm), 0);
	}

}
