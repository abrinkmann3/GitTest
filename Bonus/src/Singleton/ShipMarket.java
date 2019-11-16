package Singleton;

import java.util.HashMap;
import java.util.Map;

public class ShipMarket {

	private static ShipMarket instance;
	private Map<Ship, ShipOwner> shipListSale = new HashMap<Ship, ShipOwner>();
	private Map<Ship, ShipOwner> shipListBuy = new HashMap<Ship, ShipOwner>();

	public void finalize() throws Throwable {

	}

	private ShipMarket() {

		System.out.println("ShipMarket erzeugt");

	}

	public void advertiseShipForSale(Ship ship, ShipOwner name) {
		shipListSale.put(ship, name);

	}

	public void completeTransfer(Ship ship, ShipOwner newOwner, ShipOwner oldOwner) {

	}

	public static synchronized ShipMarket getInstance() {
		if (instance == null) {
			instance = new ShipMarket();

		}
		return instance;
	}

	public void registerInterestForShip(Ship ship, ShipOwner name) {
		shipListBuy.put(ship, name);

	}
}// end ShipMarket