package Proxy;

public class DateiZugriff implements IDateiZugriff {
	
	String name;
	
	public DateiZugriff(String name) {
		this.name = name;
		System.out.println("Echtes Objekt instanziiert.");
	}
	

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getInhalt() {
		//Simulation einer Datei-Leseoperation
		return ("Daten von " + name);
	}

}
