package sdflkjdsf;

public class Sebesseg {

    private double s;

    public Sebesseg(double val, String me) throws WrongMeException { //átváltás m/s
        switch(me){
            case "m/s": s = val;break;
            case "k/h": s = val* 0.277778;break;
            case "mi/h": s = val*0.44704;break;
            case "knot": s = val*0.51444444444;break;
            default: throw new WrongMeException();
        }
    }

     public double as(String mertekegyseg) throws WrongMeException {
            switch(mertekegyseg) {
                case "m/s":
                    return this.s;
                case "k/h":
                    return this.s / 3.6;
                case "mi/h":
                    return this.s / 0.44704;
                case "knot":
                    return this.s / 1.9438444924574;
                default:
                    throw new WrongMeException();
            }
        }

        public double SebessegSkalar(double skalar) throws WrongMeException  {
            return new Sebesseg(this.s*skalar, "m/s");
        }

        public double SebessegNegacio() throws WrongMeException  {
            return new Sebesseg(this.s*-1, "m/s");
        }

        public double IdovelSzorzas(double ido) throws WrongMeException  {
            return new Sebesseg(this.s*ido, "m/s");
        }
    }
