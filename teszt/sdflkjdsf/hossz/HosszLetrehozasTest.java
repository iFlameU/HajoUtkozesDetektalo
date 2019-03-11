package sdflkjdsf.hossz;

import static org.junit.Assert.*;

import org.junit.Test;

import sdflkjdsf.Hossz;

public class HosszLetrehozasTest {

	@Test
	public void testLetrehozasCm(){
		assertNotNull(new Hossz(120, Hossz.ME.cm));
	}
	@Test
	public void testLetrehozasM(){
		assertNotNull(new Hossz(120, Hossz.ME.m));
	}
	@Test
	public void testLetrehozasKm(){
		assertNotNull(new Hossz(120, Hossz.ME.km));
	}
	@Test
	public void testLetrehozasIn(){
		assertNotNull(new Hossz(120, Hossz.ME.in));
	}
	@Test
	public void testLetrehozasFt(){
		assertNotNull(new Hossz(120, Hossz.ME.ft));
	}
	@Test
	public void testLetrehozasYd(){
		assertNotNull(new Hossz(120, Hossz.ME.yd));
	}
	@Test
	public void testLetrehozasMile(){
		assertNotNull(new Hossz(120, Hossz.ME.mile));
	}
	@Test
	public void testLetrehozasNm(){
		assertNotNull(new Hossz(120, Hossz.ME.nm));
	}
}
