package Vermittler;

public class KonkreterVermittler extends Vermittler {

	private KonkreterKollegeA kollegeA;
	private KonkreterKollegeB kollegeB;

	public KonkreterVermittler() {
		System.out.println("KonkreterVermittler: instanziiert");
	}

	// bei Aenderungen ruft der geanderte Kollege diese Vermittler-Methode auf
	@Override
	public void aenderungAufgetreten(Kollege k) {

		if (k == (Kollege) kollegeA) {
			System.out.println("KonkreterVermittler: informiert KollegeB");
			kollegeB.methodeB();
		} else if (k == (Kollege) kollegeB) {
			System.out.println("KonkreterVermittler: informiert KollegeA");
			kollegeA.methodeA();

		}

	}
	public void setKollegeA(KonkreterKollegeA kka) {
		kollegeA= kka;
	}
	
	public void setKollegeB(KonkreterKollegeB kkb) {
		kollegeB = kkb;
	}

}
