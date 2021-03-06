package Fabrikmethode;

public class BerlinerSalamiPizza extends Pizza {

	public BerlinerSalamiPizza() {
		vorbereiten();
		backen();
		schneiden();
		verpacken();
	}

	@Override
	public void vorbereiten() {
		System.out.println(this.getClass().getSimpleName() + " vorbereitet.");

	}

	@Override
	public void backen() {
		System.out.println(this.getClass().getSimpleName() + " gebacken.");

	}

	@Override
	public void schneiden() {
		System.out.println(this.getClass().getSimpleName() + " geschnitten.");

	}

	@Override
	public void verpacken() {
		System.out.println(this.getClass().getSimpleName() + " verpackt.");
	}
}
