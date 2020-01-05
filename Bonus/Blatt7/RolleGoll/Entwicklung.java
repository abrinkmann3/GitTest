package RolleGoll;

public class Entwicklung {
	private Mitarbeiter mitarbeiter;
	private String projekt;
	
	public Entwicklung(String projekt) {
		this.projekt = projekt;
	}
	
	public String getAbteilung() {
		return "Entwicklung";
	}
	
	public void printProjekt() {
		System.out.println(mitarbeiter.getName() + " " + "arbeitet momentan an: "+ projekt);
	}
	
	public Mitarbeiter getMitarbeiter() {
		return mitarbeiter;
	}
	
	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}

}
