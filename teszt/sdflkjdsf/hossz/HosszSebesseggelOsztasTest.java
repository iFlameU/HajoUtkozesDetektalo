package sdflkjdsf.hossz;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import org.mockito.Mockito;
import sdflkjdsf.Hossz;
import sdflkjdsf.Hossz.ME;
import sdflkjdsf.IdoInterface;
import sdflkjdsf.SebessegInterface;

public class HosszSebesseggelOsztasTest {

	private SebessegInterface sebesseg;

	@Before
	public void setUp() throws Exception {
		sebesseg = Mockito.mock(SebessegInterface.class);
	}

	@Test
	public void test120HosszPer20Sebesseg() {
		when(sebesseg.getSebesseg()).thenReturn(20.0);
		Hossz hossz = new Hossz(120, ME.cm);
		assertEquals(6, hossz.sebessegelOssztas(sebesseg), 0);
	}

	@Test
	public void test0HosszPer20Sebesseg() {
		when(sebesseg.getSebesseg()).thenReturn(20.0);
		Hossz hossz = new Hossz(0, ME.cm);
		assertEquals(0, hossz.sebessegelOssztas(sebesseg), 0);
	}

	@Test
	public void test120HosszPer0Sebesseg() {
		when(sebesseg.getSebesseg()).thenReturn(0.0);
		Hossz hossz = new Hossz(120, ME.cm);
		assertEquals(Double.POSITIVE_INFINITY, hossz.sebessegelOssztas(sebesseg), 0);
	}

	@Test
	public void test0HosszPer0Sebesseg() {
		when(sebesseg.getSebesseg()).thenReturn(0.0);
		Hossz hossz = new Hossz(0, ME.cm);
		assertEquals(0, hossz.sebessegelOssztas(sebesseg), 0);
	}
}
