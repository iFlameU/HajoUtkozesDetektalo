package sdflkjdsf;

public class Kalkulator {

    private Hajo sajat;

    public Kalkulator(Hajo sajat) {
        this.sajat = sajat;
    }

    public String utkozik_e(Hajo ellenseg, int irany, Pozicio pozicio) {
        try {
            if((pozicio.getX().get(Hossz.ME.cm) < 0 && irany >= 180 && irany <= 360) ||
                    (pozicio.getX().get(Hossz.ME.cm) > 0 && irany >= 0 && irany <= 180)) return "Nem ütközik!";
            double vx = ellenseg.getSebesseg().as("m/s");
            double vy = ellenseg.getSebesseg().as("m/s");

            Ido t = new Ido(-(pozicio.getX().as("m")/vx), "s");

            double Y = pozicio.getY().as("m") + (vy * t.as("s"));


            double T = Y / sajat.getSebesseg().as("m/s");
            double dt = 3.5 * ellenseg.getHossz().as("m")/ellenseg.getSebesseg().as("m/s");
            double DT = 3.5 * sajat.getHossz().as("m")/sajat.getSebesseg().as("m/s");
            if(t.as("s") + dt < T - DT || t.as("s") - dt > T + DT) return "Nem ütközik!";
            else{
                if(irany > 270 && irany < 360 || irany > 0 && irany < 90){
                    if(pozicio.getX().as("cm")< 0){
                        return "Figyelj!";
                    }else if(pozicio.getX().as("cm") > 0){
                        return "Lassits!";
                    }
                }else if(irany >90 && irany < 270){
                    if(sajat.getTomeg().getG() < ellenseg.getTomeg().getG()){
                        return "Figyelj!";
                    }else if(sajat.getTomeg().getG() > ellenseg.getTomeg().getG()){
                        return "Lassits!";
                    }
                }
            }
        } catch (WrongMeException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String utkozikLassit2(Hajo ellenseg, int irany, Pozicio pozicio, Tomeg tomeg){
        if((irany >= 0 && irany <= 90) || (irany >= 270 && irany <= 360)){
            if((pozicio.getX().get(Hossz.ME.cm) > 0) )return "Lassits";
                else { return "Figyeljünk";}
        }
        return null;
    }
}
