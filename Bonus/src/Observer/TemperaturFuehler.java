package Observer;

import java.util.ArrayList;

public class TemperaturFuehler implements Fuehler {

	private int temperature;
	private Anzeige anzeige;
	private ArrayList<Anzeige> anzeigeListe = new ArrayList<Anzeige>();

	@Override
	public void registriereBeobachter(Anzeige a) {
		anzeigeListe.add(a);

	}

	@Override
	public void entferneBeobachter(Anzeige a) {
		anzeigeListe.remove(a);
	}

	@Override
	public String gibZustand() {
		return String.valueOf(temperature);
	}

	public void veraendern() {
		temperature++;
		for (Anzeige anzeige : anzeigeListe) {
			anzeige.aktualisieren(this);
		}

	}

}
