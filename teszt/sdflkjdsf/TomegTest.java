package sdflkjdsf;

import static org.junit.Assert.*;

import org.junit.Test;

import sdflkjdsf.Tomeg;


public class TomegTest {

	@Test
	public void testLetrehozas() throws WrongMeException {
		assertNotNull(new Tomeg(1.0, "kg"));
	}
	
	@Test(expected = WrongMeException.class)
	public void testLetrehozasRosszME() throws WrongMeException {
		new Tomeg(1.0, "marek");
	}

	@Test
	public void testHasonlitasGGUgyanaz() throws ComparingWithNullException, WrongMeException{
		assertEquals(0, (new Tomeg(1.0, "g").compareTo(new Tomeg(1.0, "g"))));
	}
	

	@Test
	public void testHasonlitasGGKisebb() throws ComparingWithNullException, WrongMeException{
		assertEquals(-1, (new Tomeg(1.0, "g").compareTo(new Tomeg(2.0, "g"))));
	}
	
	@Test
	public void testHasonlitasGGNagyobb() throws ComparingWithNullException, WrongMeException{
		assertEquals(1, (new Tomeg(2.0, "g").compareTo(new Tomeg(1.0, "g"))));
	}

	@Test
	public void testHasonlitasGKgUgyanaz() throws ComparingWithNullException, WrongMeException{
		assertEquals(0, (new Tomeg(1000.0, "g").compareTo(new Tomeg(1.0, "kg"))));
	}
	@Test
	public void testHasonlitasGTUgyanaz() throws ComparingWithNullException, WrongMeException{
		assertEquals(0, (new Tomeg(1000000.0, "g").compareTo(new Tomeg(1.0, "t"))));
	}
	@Test
	public void testHasonlitasGOzUgyanaz() throws ComparingWithNullException, WrongMeException{
		assertEquals(0, (new Tomeg(28.34952, "g").compareTo(new Tomeg(1.0, "oz"))));
	}
	@Test
	public void testHasonlitasGLbUgyanaz() throws ComparingWithNullException, WrongMeException{
		assertEquals(0, (new Tomeg(453.59232, "g").compareTo(new Tomeg(1.0, "lb"))));
	}	

	@Test
	public void testHasonlitasGLbNagyobb() throws ComparingWithNullException, WrongMeException{
		assertEquals(1, (new Tomeg(453.59233, "g").compareTo(new Tomeg(1.0, "lb"))));
	}
	
	@Test
	public void testHasonlitasKgLbNagyobb() throws ComparingWithNullException, WrongMeException{
		assertEquals(1, (new Tomeg(0.45359233, "kg").compareTo(new Tomeg(1.0, "lb"))));
	}
	
	@Test
	public void testHasonlitasKgLbUgyanaz() throws ComparingWithNullException, WrongMeException{
		assertEquals(0, (new Tomeg(0.45359232, "kg").compareTo(new Tomeg(1.0, "lb"))));
	}

	@Test(expected = ComparingWithNullException.class)
	public void testHasonlitasGNull() throws ComparingWithNullException, WrongMeException{
			(new Tomeg(28.34952, "g")).compareTo(null);
	}

}
