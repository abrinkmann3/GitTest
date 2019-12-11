package Aufgabe_5_2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TelefonTest {
	private Mobiltelefon telefon;

	@Before
	public void setUp() throws Exception {
		telefon = new Mobiltelefon("Hans Müller", "Samsung", "silber");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEinschalten() {
		telefon.einschalten();
		assertEquals("Mobiltelefon sollte eingeschaltet sein",true,telefon.getEingeschaltet());
	}

	@Test
	public void testAusschalten() {
		telefon.ausschalten();
		assertEquals("Mobiltelefon sollte ausgeschaltet sein",false,telefon.getAusgeschaltet());
	}

	@Test
	public void testTelefonieren() {
		telefon.telefonieren("0815");
		assertTrue("Ist am telefonieren", true);
		
	}

	@Test
	public void testSpielen() {
		telefon.spielen();
		assertTrue("Ist am Spielen", true);
	}


}
