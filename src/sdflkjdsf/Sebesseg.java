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
        
        public int compareTo(Sebesseg sebesseg) throws ComparingWithNullException {
		if(sebesseg == null) throw new ComparingWithNullException();
		 if(s == sebesseg.getG()) return 0;
		 if(s > sebesseg.getG()) return 1;
		 return -1;
		 
	}

        public SebessegSkalar(double skalar){
            return new Sebesseg(this.s*skalar, "m/s");
        }

        public SebessegNegacio(){
            return new Sebesseg(this.s*-1, "m/s");
        }

        }
        public IdovelSzorzas(double ido){
            return new Sebesseg(this.s*ido, "m/s");
        }
    }
