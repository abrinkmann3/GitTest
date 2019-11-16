package Observer;

public class Tester {

	public static void main(String[] args) {

		Anzeige anzeige = new TemperaturAnzeige();
		Anzeige anzeige2 = new FahrenheitAnzeige();
		Fuehler fuehler = new TemperaturFuehler();

		fuehler.registriereBeobachter(anzeige);
		fuehler.registriereBeobachter(anzeige2);

		for (int i = 1; i < 5; i++) {
			fuehler.veraendern();
			sleep();
		}

	}

	private static void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
