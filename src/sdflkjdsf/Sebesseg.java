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
