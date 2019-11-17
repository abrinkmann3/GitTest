package AbstrakteFabrik;

public class Produktionsmaschine {
	private IAbstrakteFabrik fabrik = null;
	
	public void setFabrik(IAbstrakteFabrik f) {
		this.fabrik=f;
	}
	public void fuelleSchachtel() {
		for (int i= 0; i< 5;i++) {
			fabrik.erzeugeMutter();
			fabrik.erzeugeSchraube();
		}
	}

}
