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
    public void testUgyanArraAzInputraUgyanAztKapomX(){
        assertEquals(new Pozicio(10,10).getX(), new Pozicio(10,10).getX());
    }

    @Test
    public void testUgyanArraAzInputraUgyanAztKapomY(){
        assertEquals(new Pozicio(10,10).getY(), new Pozicio(10,10).getY());
    }

    @Test
    public void testJotKapokVissza(){
        assertEquals(10, new Pozicio(11,10).getY());
    }

    @Test
    public void testJotKapokVissza2(){
        assertEquals(10, new Pozicio(10,11).getX());
    }

    @Test
    public void testJotKapokVissza3(){
        assertEquals(-10, new Pozicio(-10,11).getX());
    }

    @Test
    public void testLetezikHajo(){
        assertNotNull(new Pozicio(10, 10));
    }
}