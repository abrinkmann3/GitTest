package RolleGoll;

public class TestRolle {

	public static void main(String[] args) {
		Mitarbeiter maier = new Mitarbeiter("Maier");
		Mitarbeiter schulze = new Mitarbeiter("Schulze");

		Entwicklung e1 = new Entwicklung("Produkt 2.0");
		Entwicklung e2 = new Entwicklung("Produkt Addon 1.0");
		
		//Zuordnung der Rollen
		e1.setMitarbeiter(schulze);
		e2.setMitarbeiter(maier);

		// Aktuelle Projekte der Ma
		System.out.println("\nAktuelle Projekte der Mitabeiter: ");
		e1.printProjekt();
		e2.printProjekt();

		// Ein Kernobjekt spielt eine weitere Rolle
		System.out.println("\nSchulz erhaelt zusätzliche Aufgaben im Verkauf: ");
		Verkauf v1 = new Verkauf(15000);
		v1.setMitarbeiter(schulze);

		// Ausgabe der Umsatzzahlen
		System.out.println("\nNur Schulz ist in der Abteilung Verkauf: ");
		v1.printUmsatz();

	}

}
