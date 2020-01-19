package Fabrikmethode;


public class BerlinPizzeria extends Pizzeria {
	
	public BerlinPizzeria() {
		
	}
	

	@Override
	public Pizza erstellePizza(String p) {
		
		switch(p) {
		
		case "Salami": return new BerlinerSalamiPizza();
		
		case "Schinken": return new BerlinerSchinkenPizza();
		
		case "Thunfisch": return new BerlinerThunfischPizza();
		
		default: return null;
		
		}
	}
}

	
	


