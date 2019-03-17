/*
Polynár Dávid
FLQF7M
*/

package sdflkjdsf;

public class Hajo {

    private Tomeg tomeg;
    private Sebesseg sebesseg;
    private Hossz hossz;

    public Hajo(Tomeg tomeg, Sebesseg sebesseg, Hossz hossz) {
        this.tomeg = tomeg;
        this.sebesseg = sebesseg;
        this.hossz = hossz;
    }

    public Tomeg getTomeg() {
        return tomeg;
    }

    public void setTomeg(Tomeg tomeg) {
        this.tomeg = tomeg;
    }

    public Sebesseg getSebesseg() {
        return sebesseg;
    }

    public void setSebesseg(Sebesseg sebesseg) {
        this.sebesseg = sebesseg;
    }

    public Hossz getHossz() {
        return hossz;
    }

    public void setHossz(Hossz hossz) {
        this.hossz = hossz;
    }

    public String utkozik_e(Hajo ellenseg, int irany, Pozicio pozicio) {
        if((pozicio.getX().get(Hossz.ME.cm) < 0 && irany >= 180 && irany <= 360) ||
                (pozicio.getX().get(Hossz.ME.cm) > 0 && irany >= 0 && irany <= 180)) return "Nem ütközik!";

        return null;
    }
}
