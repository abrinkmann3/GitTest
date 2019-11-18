package Fabrikmethode;

public class MuenchenPizzeria extends Pizzeria {

	public MuenchenPizzeria() {

	}

	@Override
	public IPizza erstellePizza(String p) {

		return new MuenchenerSalamiPizza();
	}

}
