package Fassade;

public class Verstaerker {
	public void ein() {
		System.out.println("Verst�rker eingeschaltet.");
	}

	public void aus() {

	}

	public void setCD() {

	}

	public void setDvd() {
		System.out.println("Tonspur DVD gew�hlt.");

	}

	public void setStereoSound() {

	}
	
	public void setSound(String eingabe) {
		if(eingabe == "Surround") {
			System.out.println("Surround Sound eingeschaltet.");
		}else if(eingabe == "Stereo") {
			System.out.println("Stereo Sound eingeschaltet.");
		}else System.out.println("Ung�ltiges Format");
		
	}

}
