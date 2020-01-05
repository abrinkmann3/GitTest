package RolleFowler;

import java.util.ArrayList;
import java.util.List;

public class Mitarbeiter {
	private String name;
	
	private List <MitarbeiterRolle> maListe = new ArrayList <MitarbeiterRolle>(); 
	
	public void addRole(MitarbeiterRolle ma) {
		maListe.add(ma);
	}
	
	public MitarbeiterRolle rolle (String roleName) {
		for(MitarbeiterRolle liste:maListe) {
			return liste;
		}
		return null;
	
	}
}
