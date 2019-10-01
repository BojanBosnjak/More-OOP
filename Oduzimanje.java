package DvadesetDevet;

public class Oduzimanje extends BinarnaOperacija {

	public Oduzimanje(Izraz levi, Izraz desni) {
		super(levi, desni);
		
	}
	
	public double izracunaj(){
		double vrednostLevogIzraza = levi.izracunaj();
		double vrednostDesnogIzraza = desni.izracunaj();
		
		return vrednostLevogIzraza - vrednostDesnogIzraza;
	}
	@Override
	public String toString() {
		return "Sabiranje [izracunaj()=" + izracunaj() + "]";
	}

}
