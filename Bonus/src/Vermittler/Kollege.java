package Vermittler;

public abstract class Kollege {
	
	private Vermittler vermittler; //Referenz auf weiteren Vermittler
	
	public Kollege(Vermittler v) {
		vermittler = v;
	}
	//Wird von den ableitenden Klassen überschrieben
	public void aenderung() {
		vermittler.aenderungAufgetreten(this); //Vermittler informiert
	}

}
