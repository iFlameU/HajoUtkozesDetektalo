/*
Polynár Dávid
FLQF7M
*/

package sdflkjdsf;

import org.junit.Before;
import org.junit.Test;

import javax.swing.text.Position;
import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class PozicioTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testUgyanArraAzInputraUgyanAztKapomX() throws WrongMeException {
        assertEquals(new Pozicio(new Hossz(2, Hossz.ME.nm), new Hossz(2, Hossz.ME.nm)).getX(), new Pozicio(new Hossz(2, Hossz.ME.nm), new Hossz(2, Hossz.ME.nm)).getX());
    }

    @Test
    public void testUgyanArraAzInputraUgyanAztKapomY() throws WrongMeException {
        assertEquals(new Pozicio(new Hossz(2, Hossz.ME.nm), new Hossz(2, Hossz.ME.nm)).getY(), new Pozicio(new Hossz(2, Hossz.ME.nm), new Hossz(2, Hossz.ME.nm)).getY());
    }

    @Test
    public void testJotKapokVissza() throws WrongMeException {
        assertEquals(2,(int) new Pozicio(new Hossz(3, Hossz.ME.nm), new Hossz(2, Hossz.ME.nm)).getY().get(Hossz.ME.nm));
    }

    @Test
    public void testJotKapokVissza2() throws WrongMeException {
        assertEquals(2, (int) new Pozicio(new Hossz(2, Hossz.ME.nm), new Hossz(3, Hossz.ME.nm)).getX().get(Hossz.ME.nm));
    }

    @Test
    public void testJotKapokVissza3() throws WrongMeException {
        assertEquals(-10, (int) new Pozicio(new Hossz(2, Hossz.ME.nm), new Hossz(-10, Hossz.ME.nm)).getY().get(Hossz.ME.nm));
    }

    @Test
    public void testLetezikHajo() throws WrongMeException {
        assertNotNull(new Pozicio(new Hossz(2, Hossz.ME.nm), new Hossz(2, Hossz.ME.nm)));
    }
}