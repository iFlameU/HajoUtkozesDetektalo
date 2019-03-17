package sdflkjdsf;

import static org.junit.Assert.*;

import org.junit.Test;

import sdflkjdsf.Tomeg;

public SebessegTeszt {

@Test
public void testLetrehozasSebesseg() throws WrongMeException {
        assertNotNull(new Sebesseg(1.0, "m/s"));
    }
    @Test
public void KilometerPerHourToMeterPerSecond() throws WrongMeException{
            assertEquals(new Sebesseg(1.0, "m/s").compareTo(new Sebesseg(0.277778, "k/h")));
        }
        @Test
public void MilePerHourToMeterPerSecond() throws WrongMeException{
            assertEquals(new Sebesseg(1.0, "m/s").compareTo(new Sebesseg(0.44704, "mi/h")));
        }
        @Test
public void KnotToMeterPerSecond() throws WrongMeException{
            assertEquals(new Sebesseg(1.0, "m/s")).compareTo(new Sebesseg(0.51444444444, "knot"));
        }
        @Test
public void SkalarTest() throws WrongMeException{
            Sebesseg sebesseg = new Sebesseg(100);
            assertEquals(new SebessegSkalar(5).compareTo(500));
        }
        @Test
public void NegacioTest() throws WrongException{
            asseretEquals(new SebessegNegacio(100).compareTo(-100));
        }
        @Test
        public void IdoSzorzasTest() throws WrongMeException{
            Sebesseg sebesseg = new Sebesseg(100);
            assertEquals(new Sebesseg(20).compareTo(2000));
        }
}