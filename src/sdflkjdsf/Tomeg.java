package sdflkjdsf;

public class Tomeg{
	
	private double t;

	public Tomeg(double val, String me) throws WrongMeException {
		switch(me){
		case "g": t = val;break;
		case "kg": t = val*1000;break;
		case "t": t = val*1000000;break;
		case "oz": t = val*28.34952;break;
		case "lb": t = val*28.34952*16;break;
		default: throw new WrongMeException();
		}
	}

	public double getG(){
		return t;
	}
	
	public int compareTo(Tomeg tomeg) throws ComparingWithNullException {
		if(tomeg == null) throw new ComparingWithNullException();
		 if(t == tomeg.getG()) return 0;
		 if(t > tomeg.getG()) return 1;
		 return -1;
		 
	}

}
