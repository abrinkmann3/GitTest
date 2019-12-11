package Uebung5.src.online_Modegeschaeft;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BestellungTest {
	
	private Bestellungen best;
	private Bestellungen best2;
	private Bestellungen best3;
	private Kunde k3;
	private Kunde k1;
	private Kunde k2;
	
	@Before
	public void setUp() throws Exception {
		k1 = new Kunde("1; Brinkmann; Alex;52");
		k2 = new Kunde("2; Eickmann; Lucas;16");
		k3 = new Kunde("3; Siegmann; Sebastian;18");
		
		best = new Bestellungen();
		best2 = new Bestellungen();
		best3 = new Bestellungen();
		
	}

	@Test
	public void testGetGesamtbetrag() {
		
		Artikel NikeFree = new Artikel(1, "Nike Free",89.99);
		k1.hinzufuegenArtikelInWarenkorb(NikeFree);
		k1.setAnzVergangenerBestellungen(10);
		k1.bestellen(best, true);
		
		assertEquals("Passt", 79.99, best.getBestellung(1).getGesamtbetrag() ,0.001);
		
	}
	
	@Test
	public void test2GetGesamtbetrag() {
		
		Artikel HilfigerTshirt = new Artikel(1, "Hilfinger Tshirt", 37.00);
		k2.hinzufuegenArtikelInWarenkorb(HilfigerTshirt);
		k2.setAnzVergangenerBestellungen(4);
		k2.bestellen(best2, false);
		
		assertEquals("Passt", 35.15, best2.getBestellung(1).getGesamtbetrag() ,0.001);
		
	}
	
	@Test
	public void test3GetGesamtbetrag() {
		
		Artikel Socken = new Artikel(1, "Socken", 400.00);
		k3.hinzufuegenArtikelInWarenkorb(Socken);
		k3.setAnzVergangenerBestellungen(14);
		k3.bestellen(best3, true);
		
		assertEquals("Passt", 390, best3.getBestellung(1).getGesamtbetrag() ,0.001);
		
	}

}
