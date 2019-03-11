package sdflkjdsf.hossz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import sdflkjdsf.Hossz;
import sdflkjdsf.Hossz.ME;

public class HosszOsszeadasTest {

	private Hossz hossz;

	@Before
	public void setUp() throws Exception {
		hossz = new Hossz(120, ME.cm);
	}
	
	@Test
	public void testOsszeadasVisszateritettErtekeHosszTipusu() {
		assertTrue(hossz.add(new Hossz(1, ME.cm)) instanceof Hossz);
	}
	
	@Test
	public void testOsszeadasVisszateritettErtekeMegfeleloErteku() {
		assertEquals(121, hossz.add(new Hossz(1, ME.cm)).get(ME.cm), 0);
	}
	

}
