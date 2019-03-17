package sdflkjdsf;

public class Hajo implements HajoInterface {

    Tomeg tomeg;
    SebessegInterface sebesseg;
    Hossz hossz;

    public Hajo(Tomeg tomeg, SebessegInterface sebesseg, Hossz hossz) {
        this.tomeg = tomeg;
        this.sebesseg = sebesseg;
        this.hossz = hossz;
    }

    @Override
    public String utkozik_e(HajoInterface ellenseg, int irany, PozicioInterface pozicio) {
        return null;
    }
}
