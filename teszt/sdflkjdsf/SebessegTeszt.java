package sdflkjdsf;

import static org.junit.Assert.*;

import org.junit.Test;

import sdflkjdsf.Tomeg;

public class SebessegTeszt {

@Test
public void testLetrehozasSebesseg() throws WrongMeException {
        assertNotNull(new Sebesseg(1.0, "m/s"));
    }
    @Test
public void KilometerPerHourToMeterPerSecond() throws WrongMeException{
            assertEquals(new Sebesseg(1.0, "m/s"), new Sebesseg(0.277778, "km/h"));
        }
        @Test
public void MilePerHourToMeterPerSecond() throws WrongMeException{
            assertEquals(new Sebesseg(1.0, "m/s"), new Sebesseg(0.44704, "mi/h"));
        }
        @Test
public void KnotToMeterPerSecond() throws WrongMeException{
            assertEquals(new Sebesseg(1.0, "m/s"), new Sebesseg(0.51444444444, "knot"));
        }
        @Test
public void SkalarTest() throws WrongMeException{
            Sebesseg sebesseg = new Sebesseg(100, "m/s");
            assertEquals(sebesseg.SebessegSkalar(5), 500);
        }
        @Test
public void NegacioTest() throws WrongMeException{
            assertEquals(new Sebesseg(100, "m/s").SebessegNegacio(), -100);
        }
        @Test
        public void IdoSzorzasTest() throws WrongMeException{
            Sebesseg sebesseg = new Sebesseg(100, "m/s");
            assertEquals(sebesseg.IdovelSzorzas(20), 2000);
        }
}
