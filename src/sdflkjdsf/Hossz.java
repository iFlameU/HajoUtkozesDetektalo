package sdflkjdsf;

public class Hossz {

	double h;
	
	public Hossz(double val, String me) throws WrongMeException {
		switch(me){
		case "cm": h = val; break;
		case "m": h = val; break;
		case "km": h = val; break;
		case "in": h = val; break;
		case "ft": h = val; break;
		case "yd": h = val; break;
		case "mile": h = val; break;
		case "nm": h = val; break;
		default: throw new WrongMeException();
		}
	}

}
