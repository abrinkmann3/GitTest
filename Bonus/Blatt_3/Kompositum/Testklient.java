package Kompositum;

public class Testklient {

	public static void main(String[] args) {
		SpeisekartenKomponente karte0 = new Speisekarte("Hauptkarte", "Übersicht");
		
		SpeisekartenKomponente karte1 = new Speisekarte("Hauptgerichte", "Unsere Hauptgerichte: ");
		SpeisekartenKomponente speise1 = new Speise("Wiener Schnitzel", "Paniertes Kalbsschnitzel mit Gurkensalat",
				19.50, false);
		SpeisekartenKomponente speise2 = new Speise("Mantaplatte", "Currywurst mit Pommes Mayo", 6.50, false);

		SpeisekartenKomponente karte2 = new Speisekarte("Desert", "Unsere Deserts");
		SpeisekartenKomponente speise3 = new Speise("Apfelstrudel", "Selbstgemachter Apfelstrudel mit Vanille Sauce",
				8.50,true );
		SpeisekartenKomponente speise4 = new Speise("Eisbecher", "Gemischter Eisbecher mit 3 Kugeln nach Wahl", 6.50, true);

		karte0.hinzufuegen(karte1); // Gesamtkarte

		karte1.hinzufuegen(speise1); //Karte "Hauptgerichte" hinzufuegen
		karte1.hinzufuegen(speise2); 

		karte0.hinzufuegen(karte2); //Karte "Desert" hinzufuegen
		karte2.hinzufuegen(speise3);
		karte2.hinzufuegen(speise4);

		//System.out.println("\n Gesamtekarte");
		karte0.ausgeben();

		

	}

}
