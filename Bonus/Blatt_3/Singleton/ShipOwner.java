package Singleton;

import java.util.ArrayList;

public class ShipOwner {

	private ShipMarket market;
	private String name;
	public ShipMarket m_ShipMarket;

	private ArrayList<Ship> myShips = new ArrayList<Ship>();

	public void finalize() throws Throwable {

	}

	public ShipOwner(String name) {
		this.name = name;

	}

	public void advertiseShipForSale(Ship ship, ShipOwner name) {
		myShips.remove(ship);
		market.advertiseShipForSale(ship, name);

	}

	public String getName() {
		return name;
	}

	public void registerInterestForShip(Ship ship) {
		myShips.add(ship);

	}
}// end ShipOwner