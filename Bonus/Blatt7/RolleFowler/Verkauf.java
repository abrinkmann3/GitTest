package RolleFowler;

public class Verkauf extends MitarbeiterRolle {
	
	int umsatz;
	
	public Verkauf(int umsatz) {
		this.umsatz = umsatz;
	}
	
	public String getAbteilung() {
		return "Verkauf";
	}
	
	public void printUmsatz() {
		System.out.println("Aktueller Umsatz von " + super.ge() + ": "+ umsatz + " Euro");
	}

}
