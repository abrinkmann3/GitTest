package Proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		//Das Proxy-Objekt wird erzeugt.
		ProxyDateiZugriff pDatei = new ProxyDateiZugriff("TestDatei.dat");
		System.out.println();
		System.out.println("Name: "+ pDatei.getName());
		System.out.println("Inhalt: "+ pDatei.getInhalt());
		System.out.println();
		System.out.println("Inhalt: "+ pDatei.getInhalt());
		

	}

}
