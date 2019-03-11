package sdflkjdsf;

import org.junit.*;

public class KalkulatorTest {

	private static Kalkulator k;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Tomeg t = new Tomeg(10000.0, "t");
		Hossz h = new Hossz(120, "m");
		Sebesseg s = new Sebesseg(5, "m/s");
		HajoInterface sajat = new Hajo(t, h, s);
		k = new Kalkulator(sajat);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws WrongMeException {
		Tomeg t = new Tomeg(8000.0, "t");
		Hossz h = new Hossz(100, "m");
		Sebesseg s = new Sebesseg(5, "m/s");
		HajoInterface ellenseg = new Hajo(t, h, s);
		Pozicio pozicio = new Pozicio(new Hossz(2, "nm"), new Hossz(2, "nm"));
		int irany = 270;
		assertEquals("Lassits!", k.utkozik_e(ellenseg, irany, pozicio));
	}

    @Test
    public void testUtkozik_eElkerul() throws WrongMeException {
        Tomeg t = new Tomeg(10000.0, "t");
        Hossz h = new Hossz(120, "m");
        Sebesseg s = new Sebesseg(5, "m/s");
        HajoInterface ellenseg = new Hajo(t, h, s);
        Pozicio pozicio = new Pozicio(new Hossz(2, "nm"), new Hossz(2, "nm"));
        int irany = 270;
        assertEquals("Elkerul!", k.utkozik_e(ellenseg, irany, pozicio));
    }

}
