package sdflkjdsf;

import java.util.HashMap;

public class Hossz {

	public static final double ZERO = 0;
	
	public static enum ME{
		cm, m, km, in, ft, yd, mile, nm;
	}

	double h;
	HashMap<ME, Double> valtoertek;

	public Hossz(double val, String me) throws WrongMeException {
		initValtoertekek();
		switch(me){
			case "cm": h = val*valtoertek.get(ME.cm); break;
			case "m": h = val*valtoertek.get(ME.m); break;
			case "km": h = val*valtoertek.get(ME.km); break;
			case "in": h = val*valtoertek.get(ME.in); break;
			case "ft": h = val*valtoertek.get(ME.ft); break;
			case "yd": h = val*valtoertek.get(ME.yd); break;
			case "mile": h = val*valtoertek.get(ME.mile); break;
			case "nm": h = val*valtoertek.get(ME.nm); break;
			default: throw new WrongMeException();
		}
	}
	
	public Hossz(double val, ME me){
		initValtoertekek();
		switch(me){
		case cm: h = val*valtoertek.get(ME.cm); break;
		case m: h = val*valtoertek.get(ME.m); break;
		case km: h = val*valtoertek.get(ME.km); break;
		case in: h = val*valtoertek.get(ME.in); break;
		case ft: h = val*valtoertek.get(ME.ft); break;
		case yd: h = val*valtoertek.get(ME.yd); break;
		case mile: h = val*valtoertek.get(ME.mile); break;
		case nm: h = val*valtoertek.get(ME.nm); break;
		}
	}

	private void initValtoertekek() {
		valtoertek = new HashMap<>();
		valtoertek.put(ME.cm, 1.0);
		valtoertek.put(ME.m, 100.0);
		valtoertek.put(ME.km, 100000.0);
		valtoertek.put(ME.in, 2.54);
		valtoertek.put(ME.ft, 30.48);
		valtoertek.put(ME.yd, 91.44);
		valtoertek.put(ME.mile, 160934.4);
		valtoertek.put(ME.nm, 185200.0);
	}

	public double as(String me){
		switch (me){
			case "cm" return get(ME.cm);
			case "m" return get(ME.m);
			case "km" return get(ME.km);
			case "in" return get(ME.in);
			case "ft" return get(ME.ft);
			case "yd" return get(ME.yd);
			case "mile" return get(ME.mile);
			case "nm" return get(ME.nm);
		}
	}

	public double get(ME me) {
		return h/valtoertek.get(me);
	}
	
	public Hossz skalarralSzorzas(double d) {
		return new Hossz(this.h * d, ME.cm);
	}
	
	public Hossz negate() {
		return new Hossz(this.h*-1, ME.cm);
	}
	
	public Hossz add(Hossz hossz) {
		return new Hossz(this.h + hossz.get(ME.cm), ME.cm);
	}
	
	public double sebessegelOssztas(SebessegInterface sebesseg) {
		if(this.h == 0) return 0;
		return this.h/sebesseg.getSebesseg();
	}

	public int compareTo(Hossz hossz){
		return (Double.compare(this.h, hossz.get(ME.cm)));
	}
}
