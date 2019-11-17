package Fabrikmethode;

public abstract class MuenchenPizza extends Pizzeria {

	public MuenchenPizza() {

	}

	@Override
	public IPizza erstellePizza(String p) {

		return new MuenchenerSalamiPizza();
	}

}
