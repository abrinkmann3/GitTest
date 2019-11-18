package Observer;

public interface Fuehler {
	public void registriereBeobachter(Anzeige a);
	public void entferneBeobachter(Anzeige a);
	public String gibZustand();
	public void veraendern();
	

}
