package Vermittler;

public abstract class Kollege {
	
	private Vermittler vermittler; //Referenz auf weiteren Vermittler
	
	public Kollege(Vermittler v) {
		vermittler = v;
	}
	//Wird von den ableitenden Klassen �berschrieben
	public void aenderung() {
		vermittler.aenderungAufgetreten(this); //Vermittler informiert
	}

}
