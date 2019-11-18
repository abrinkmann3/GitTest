package Fabrikmethode;


public class TestKlient {
	
	public static void main(String[]args) {
		
		MuenchenPizzeria muenchenerPizzeria = new MuenchenPizzeria();
		BerlinPizzeria berlinerPizzeria = new BerlinPizzeria();
		
		muenchenerPizzeria.erstellePizza("Schinken");
		berlinerPizzeria.erstellePizza("Salami");
		berlinerPizzeria.erstellePizza("Thunfisch");

	}

}
