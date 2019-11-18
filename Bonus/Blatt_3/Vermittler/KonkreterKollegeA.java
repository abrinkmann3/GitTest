package Vermittler;

public class KonkreterKollegeA extends Kollege {

	public KonkreterKollegeA(Vermittler v) {
		super(v);
		System.out.println("KonkreterKollegeA: instanziiert");
	}
	
	//Wird aufgerufen, wenn sich ein anderer Kollege aendert
	public void methodeA() {
		System.out.println("KonkreterKollegeA wird in methodeA() geanedert " + "als Folge der Aenderung eines Kollegen");
	}
	//Neuen Status setzen
	@Override
	public void aenderung() {
		System.out.println("KonkreterKollegeA wurde geandert durch Aufruf"+
							" der Methode aenderung().KonkreterKollegeA"+
							" informiert den Vermitller ");
		super.aenderung(); //informiert Vermittler
	}

	

}
