package Kompositum;

public class Testklient {
	
	public static void main(String[] args) {
		SpeisekartenKomponente karte0 = new Speisekarte("Hauptkarte", "Karte in Lederhülle");
		
		SpeisekartenKomponente karte1 = new Speisekarte("Hauptgerichte", "Usere herzhaften Hauptgerichte");
		SpeisekartenKomponente speise1 = new Speise("Portion Pommes", "Pommes - wahlweise mit Majo oder Ketchup", 4.50);
		SpeisekartenKomponente speise2 = new Speise("Jägerschnitzel", "Schweineschnitzel mit Pommes oder Bratkarfoffeln", 10.00);
		
		SpeisekartenKomponente karte2 = new Speisekarte("Getraenkekarte", "Getränkekerte innerhalb der Hauptkarte");
		SpeisekartenKomponente speise3 = new Speise("Vanillepudding", "Hausgemachter Pudding mit Vanillegeschmack", 3.30);
		SpeisekartenKomponente speise4 = new Speise("Portion Eis", "3 Kugeln - wählber aus tagesaktuellem Sortiment", 3.70);
		
		karte0.hinzufuegen(karte1); //Karte ohne Blatt-Einträge
		
		karte1.hinzufuegen(speise1);
		karte1.hinzufuegen(speise2);
		
		karte0.hinzufuegen(karte2);
		karte2.hinzufuegen(speise3);
		karte2.hinzufuegen(speise4);
		
		System.out.println("\n\n### Ausgebe der gesamten Struktur ###");
		karte0.ausgeben();
		
		System.out.println("\n\n### Ausgabe der Nachtischkarte ###");
		karte2.ausgeben();
		
	}
		

}
