package Vermittler;

public class TestClient {

	public static void main(String[] args) {
		//Intialisierung
		System.out.println("Intialisierung:");
		KonkreterVermittler konkreterVermittler = new KonkreterVermittler();
		KonkreterKollegeA kollegeA = new KonkreterKollegeA (konkreterVermittler);
		konkreterVermittler.setKollegeA(kollegeA);
		KonkreterKollegeB kollegeB = new KonkreterKollegeB (konkreterVermittler);
		konkreterVermittler.setKollegeB(kollegeB);

		//KollegeA aendern
		System.out.println("\nKollegeA aendern:");
		kollegeA.aenderung();
		
		//KollegeB aendern
		System.out.println("\nKollegeB aendern:");
		kollegeB.aenderung();

	}

}
