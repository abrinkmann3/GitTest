package Fabrikmethode;

public class MuenchenPizzeria extends Pizzeria {

	public MuenchenPizzeria() {

	}

	@Override
	public Pizza erstellePizza(String p) {
		if(p.equalsIgnoreCase("Salami")){
			return new MuenchenerSalamiPizza();	
		}
		return null;
		
	}

}
