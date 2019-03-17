package sdflkjdsf;

public class Sebesseg {

    private double s;

    public Sebesseg(double val, String me) throws WrongMeException { //átváltás m/s
        switch(me){
            case "m/s": t = val;break;
            case "k/h": t = val* 0.277778;break;
            case "mi/h": t = val*0.44704;break;
            case "knot": t = val*0.51444444444;break;
            default: throw new WrongMeException();
        }

        public SebessegSkalar(double skalar){
            return new Sebesseg(this.s*skalar);
        }

        public SebessegNegacio(){
            return new Sebesseg(this.s*-1);
        }

        }
        public IdovelSzorzas(double ido){
            return new Sebesseg(this.s*ido);
        }
    }
