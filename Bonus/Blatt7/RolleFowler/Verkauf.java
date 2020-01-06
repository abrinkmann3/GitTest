package RolleFowler;

public class Verkauf extends MitarbeiterRolle {
	
	int umsatz;
	
	public Verkauf(int umsatz) {
		super();
		this.umsatz = umsatz;
	}
	
	public String getAbteilung() {
		return "Verkauf";
	}
	
	public void printUmsatz() {
		System.out.println("Aktueller Umsatz von " + mitarbeiter.getName() + ": "+ umsatz + " Euro");
	}

	public boolean hatRolle(String value) {
		if(value.equalsIgnoreCase("Verkauf"))
			return true;
		else 
			return super.hatRolle(value);
	}
}
