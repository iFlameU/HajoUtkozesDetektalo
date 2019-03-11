package sdflkjdsf.hossz;

import static org.junit.Assert.*;

import org.junit.Test;
import sdflkjdsf.Hossz;

public class HosszOsszehasonlitasTest{

    @Test
    public void hosszOsszehasonlitasCmCmEgyenlo(){
        Hossz hossz = new Hossz(120, Hossz.ME.cm);
        Hossz hossz2 = new Hossz(120, Hossz.ME.cm);
        assertEquals(0, hossz.compareTo(hossz2));
    }

    @Test
    public void hosszOsszehasonlitasCmCmKisebb(){
        Hossz hossz = new Hossz(1, Hossz.ME.cm);
        Hossz hossz2 = new Hossz(120, Hossz.ME.cm);
        assertEquals(-1, hossz.compareTo(hossz2));
    }

    @Test
    public void hosszOsszehasonlitasCmCmNagyobb(){
        Hossz hossz = new Hossz(120, Hossz.ME.cm);
        Hossz hossz2 = new Hossz(12, Hossz.ME.cm);
        assertEquals(1, hossz.compareTo(hossz2));
    }

    @Test
    public void hosszOsszehasonlitasCmMEgyenlo(){
        Hossz hossz = new Hossz(100, Hossz.ME.cm);
        Hossz hossz2 = new Hossz(1, Hossz.ME.m);
        assertEquals(0, hossz.compareTo(hossz2));
    }

    @Test
    public void hosszOsszehasonlitasMKmEgyenlo(){
        Hossz hossz = new Hossz(1000, Hossz.ME.m);
        Hossz hossz2 = new Hossz(1, Hossz.ME.km);
        assertEquals(0, hossz.compareTo(hossz2));
    }

    @Test
    public void hosszOsszehasonlitasCmInEgyenlo(){
        Hossz hossz = new Hossz(2.54, Hossz.ME.cm);
        Hossz hossz2 = new Hossz(1, Hossz.ME.in);
        assertEquals(0, hossz.compareTo(hossz2));
    }

    @Test
    public void hosszOsszehasonlitasInFtEgyenlo(){
        Hossz hossz = new Hossz(12, Hossz.ME.in);
        Hossz hossz2 = new Hossz(1, Hossz.ME.ft);
        assertEquals(0, hossz.compareTo(hossz2));
    }

    @Test
    public void hosszOsszehasonlitasFtYdEgyenlo(){
        Hossz hossz = new Hossz(3, Hossz.ME.ft);
        Hossz hossz2 = new Hossz(1, Hossz.ME.yd);
        assertEquals(0, hossz.compareTo(hossz2));
    }

    @Test
    public void hosszOsszehasonlitasYdMileEgyenlo(){
        Hossz hossz = new Hossz(1760, Hossz.ME.yd);
        Hossz hossz2 = new Hossz(1, Hossz.ME.mile);
        assertEquals(0, hossz.compareTo(hossz2));
    }

    @Test
    public void hosszOsszehasonlitasNmMEgyenlo(){
        Hossz hossz = new Hossz(1852, Hossz.ME.m);
        Hossz hossz2 = new Hossz(1, Hossz.ME.nm);
        assertEquals(0, hossz.compareTo(hossz2));
    }
}
