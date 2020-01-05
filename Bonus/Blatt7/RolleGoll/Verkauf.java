package RolleGoll;

public class Verkauf {
	
	private Mitarbeiter mitarbeiter;
	int umsatz;
	
	public Verkauf(int umsatz) {
		this.umsatz = umsatz;
	}
	
	public String getAbteilung() {
		return "Verkauf";
	}
	
	public void printUmsatz() {
		System.out.println("Aktueller Umsatz von " + mitarbeiter.getName() + ": "+ umsatz + " Euro");
	}
	
	public Mitarbeiter getMitarbeiter() {
		return mitarbeiter;
	}
	
	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}

}
