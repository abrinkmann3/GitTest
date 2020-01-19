 package RolleFowler;

import java.util.ArrayList;
import java.util.List;

public class Mitarbeiter {
	private String name;

	private List<MitarbeiterRolle> rollen;
	
	public Mitarbeiter(String name) {
		this.name = name;
		rollen = new ArrayList<MitarbeiterRolle>();
	}

	public void addRole(MitarbeiterRolle rolle) {
		rollen.add(rolle);
		rolle.setMitarbeiter(this);
	}

	public MitarbeiterRolle rolle(String roleName) {
		for (MitarbeiterRolle liste : rollen) {
			if(liste.hatRolle(roleName)) {
				return liste;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}
}
