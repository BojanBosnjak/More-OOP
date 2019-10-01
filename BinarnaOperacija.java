package DvadesetDevet;

public abstract class BinarnaOperacija extends Izraz {
	protected Izraz levi, desni;
	
	public BinarnaOperacija(Izraz levi, Izraz desni) {
		this.desni=desni;
		this.levi=levi;
	}
	
}
