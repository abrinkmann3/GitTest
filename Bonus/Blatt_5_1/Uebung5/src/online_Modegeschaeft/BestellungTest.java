package Uebung5.src.online_Modegeschaeft;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BestellungTest {
	
	private Bestellungen best;
	private Kunde brinkmann;
	
	@Before
	public void setUp() throws Exception {
		brinkmann = new Kunde("1; Brinkmann; Alex; 25");
		best = new Bestellungen();
		
	}

	@Test
	public void testGetGesamtbetrag() {
		
		Artikel NikeFree = new Artikel(1, "Nike Free", 89.99);
		brinkmann.hinzufuegenArtikelInWarenkorb(NikeFree);
		brinkmann.setAnzVergangenerBestellungen(10);
		brinkmann.bestellen(best, true);
		
		assertEquals("Passt", 79.99, best.getBestellung(1).getGesamtbetrag() ,0.001);
		
	}

}
