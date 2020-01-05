package Fassade;

public class HeimkinoSteuerung {
	private Beleuchtung licht;
	private Verstaerker verstaerker;
	private Leinwand leinwand;
	private Beamer beamer;
	private DVDSpieler dvd;
	
	public HeimkinoSteuerung() {
		licht = new Beleuchtung();
		verstaerker = new Verstaerker();
		leinwand = new Leinwand();
		beamer = new Beamer();
		dvd = new DVDSpieler();
		
	}
	
	public void filmStarten() {
		licht.dimme();
		leinwand.runter();
		verstaerker.ein();
		beamer.ein();
		dvd.ein();
		verstaerker.setDvd();
		verstaerker.setSound("Stereo");
		dvd.setSurroundSound();
		dvd.spielen();
		
	}

}
