package sdflkjdsf;

public class Ido implements IdoInterface {

    private double ido;

    public Ido(double ido, String me){

        switch (me){
            case "s": this.ido = ido; break;
            case "m": this.ido = ido*60; break;
            case "h": this.ido = ido*3600; break;
        }

    }

    @Override
    public IdoInterface skalarralSzorzas(double d) {
        return new Ido(ido * d, "s");
    }

    @Override
    public IdoInterface negacio() {
        return new Ido(ido * -1, "s");
    }

    @Override
    public IdoInterface osszeadas(IdoInterface ido) {
        return new Ido(this.ido + (ido.as("s")),"s");
    }

    @Override
    public IdoInterface kivonas(IdoInterface ido) {
        return new Ido(this.ido - (ido.as("s")),"s");
    }

    @Override
    public int osszHasonlitas(IdoInterface ido) {
        return Double.compare(this.ido, ido.as("s"));
    }

    @Override
    public double as(String me) {
        switch (me){
            case "s": return ido;
            case "m": return ido/60;
            case "h": return ido/3600;
        }
        return Double.parseDouble(null);
    }
}
