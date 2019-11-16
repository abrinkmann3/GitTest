package Proxy;

public class ProxyDateiZugriff implements IDateiZugriff {
	String name;
	IDateiZugriff realeDatei;

	public ProxyDateiZugriff(String name) {
		this.name = name;
		System.out.println("Stellvertretendes Objekt instanziiert.");
	}

	@Override
	public String getName() {

		return name;
	}

	@Override
	public String getInhalt() {
		if (realeDatei == null) {
			System.out.println("Inhalt liegt lokal nicht vor.");
			//Das echte Datei-Objekt wird erzeugt.
			realeDatei = new DateiZugriff(name);
		}
		return realeDatei.getInhalt();
	}

}
