package Kompositum;

public class Speise extends SpeisekartenKomponente {
	
	private double preis;
	private boolean isVegetarisch;

	public Speise(String name, String beschreibung, double preis,boolean isVegetarisch) {
		super(name, beschreibung);
		this.preis = preis;
		this.isVegetarisch = isVegetarisch;

	}
	
	//Ausgeben der Speise
	public void ausgeben() {
		System.out.println(
				"\t SpeiseName: " + super.getName() +" | " + super.getBeschreibung() 
				+ " | Preis: " + this.preis + " | vegetarisch? " + this.isVegetarisch());

	}

	public double getPreis() {
		return this.preis;

	}

	public String isVegetarisch() {
		if (isVegetarisch == true) {
			return "Ja";
		} else {
			return "Nein";
		}

	}
}