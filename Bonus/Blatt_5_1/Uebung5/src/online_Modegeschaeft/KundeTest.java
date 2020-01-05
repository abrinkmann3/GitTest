package Uebung5.src.online_Modegeschaeft;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class KundeTest {
	
	private Kunde k1;
	private Artikel a1;
	
	@Before
	public void setUp() throws Exception {
		k1 = new Kunde("1; Brinkmann; Alex;52");
		a1 = new Artikel(1, "Socken", 5.99);
		
	}

	@Test
	public void testLoescheArtikelAusWarenkorb() {
		k1.loescheArtikelAusWarenkorb(a1);
		assertTrue("Artikel nicht im Warenkorb", k1.getWarenkorb().isEmpty());
		
	}
	
	@Test
	public void test2LoescheArtikelAusWarenkorb() {
		k1.hinzufuegenArtikelInWarenkorb(a1);
		k1.loescheArtikelAusWarenkorb(a1);
		assertEquals("Artikel nicht im Warenkorb",0, k1.getWarenkorb().size());
		
	}
	@Test
	public void test3LoescheArtikelAusWarenkorb() {
		k1.hinzufuegenArtikelInWarenkorb(a1);
		k1.hinzufuegenArtikelInWarenkorb(a1);
		k1.loescheArtikelAusWarenkorb(a1);
		assertEquals("1 Artikel im Warenkorb",1, k1.getWarenkorb().size());
		
	}

}
