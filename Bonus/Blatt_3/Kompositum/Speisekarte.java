package Kompositum;

import java.util.ArrayList;

public class Speisekarte extends SpeisekartenKomponente {

	ArrayList<SpeisekartenKomponente> speiseListe = new ArrayList<SpeisekartenKomponente>();

	public Speisekarte(String name, String beschreibung) {
		super(name, beschreibung);
	}

	public void ausgeben() {
		System.out.println();
		System.out.println("Speisekarte: " + super.getName());

		for (SpeisekartenKomponente komp : speiseListe) {
			komp.ausgeben();
		}
	}

	public void entfernen(SpeisekartenKomponente komponente) {
		speiseListe.remove(komponente);

	}

	public SpeisekartenKomponente getKind(int index) {
		return this.speiseListe.get(index);

	}

	public void hinzufuegen(SpeisekartenKomponente komponente) {
		speiseListe.add(komponente);

	}
}