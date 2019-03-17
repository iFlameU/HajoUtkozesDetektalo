/*
Polynár Dávid
FLQF7M
*/

package sdflkjdsf;

import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class HajoTest {

    Tomeg tomeg;
    Sebesseg sebesseg;
    Hossz hossz;

    @Before
    public void setUp() throws Exception {
        tomeg = new Tomeg(1000, "kg");
        sebesseg = new Sebesseg(10, "km/h");
        hossz = new Hossz(100, "m");
    }

    @Test
    public void testLetezikHajo(){
        assertNotNull(new Hajo(tomeg, sebesseg, hossz));
    }
}