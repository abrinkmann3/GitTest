package Vermittler;

public class KonkreterKollegeB extends Kollege {

	public KonkreterKollegeB(Vermittler v) {
		super(v);
		System.out.println("KonkreterKollegeB: instanziiert");
	}
	
	//Wird aufgerufen, wenn sich ein anderer Kollege aendert
	public void methodeB() {
		System.out.println("KonkreterKollegeB wird in methodeB() geanedert " + "als Folge der Aenderung eines Kollegen");
	}
	//Neuen Status setzen
	@Override
	public void aenderung() {
		System.out.println("KonkreterKollegeB wurde geandert durch Aufruf"+
							" der Methode aenderung().KonkreterKollegeB"+
							" informiert den Vermitller ");
		super.aenderung(); //informiert Vermittler
	}

	
}
