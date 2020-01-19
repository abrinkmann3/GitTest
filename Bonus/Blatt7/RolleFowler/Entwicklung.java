package RolleFowler;

public class Entwicklung extends MitarbeiterRolle {
	private String projekt;

	public Entwicklung(String projekt) {
		super();
		this.projekt = projekt;
		
	}
	
	public String getAbteilung() {
		return "Entwicklung";
	}
	
	public void printProjekt() {
		System.out.println("Der Mitarbeiter "+ this.mitarbeiter.getName() + " arbeitet aktuell in folgendem "+ projekt +" Projekt.");
	}
	
	public boolean hatRolle(String value) {
		if(value.equalsIgnoreCase("Entwicklung"))
			return true;
		else 
			return super.hatRolle(value);
	}

}
