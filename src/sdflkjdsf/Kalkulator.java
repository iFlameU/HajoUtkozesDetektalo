package sdflkjdsf;

public class Kalkulator {

    private Hajo sajat;

    public Kalkulator(Hajo sajat) {
        this.sajat = sajat;
    }

    public String utkozik_e(Hajo ellenseg, int irany, Pozicio pozicio) {
        if((pozicio.getX().get(Hossz.ME.cm) < 0 && irany >= 180 && irany <= 360) ||
                (pozicio.getX().get(Hossz.ME.cm) > 0 && irany >= 0 && irany <= 180)) return "Nem ütközik!";
        return null;
    }
    
    public String utkozikLassit(Hajo ellenseg, int irany, Pozicio pozicio, Tomeg tomeg){
        if((irany >= 0 && irany <= 90) || (irany >= 270 && irany <= 360)){
            if((pozicio.getX().get(Hossz.ME.cm) > 0) return "Lassits";
               } else { return "Figyeljünk";}
        }
    }
}
