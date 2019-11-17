package Kompositum;

public abstract class SpeisekartenKomponente {
	private String name;
	private String beschreibung;

	public SpeisekartenKomponente(String name, String beschreibung) {
		this.name = name;
		this.beschreibung = beschreibung;

	}

	public void entfernen(SpeisekartenKomponente komponente) {
		System.out.println("Kind-Methode ist nicht implementiert!");
	}

	public String getBeschreibung() {
		return beschreibung;

	}

	public void getKind() {
		System.out.println("Kind-Methode ist nicht implementiert!");

	}

	public String getName() {
		return name;

	}

	@SuppressWarnings("null")
	public double getPreis() {
		System.out.println("Kind-Methode ist nicht implementiert!");
		return (Double) null;

	}

	public void hinzufuegen(SpeisekartenKomponente komponente) {
		System.out.println("Kind-Methode ist nicht implementiert!");

	}

	public String isVegetarisch() {
		System.out.println("Kind-Methode ist nicht implementiert!");
		return null;

	}

	// Methoden, die in allen Sub-Klassen implementiert werden muessen

	public abstract void ausgeben();
}