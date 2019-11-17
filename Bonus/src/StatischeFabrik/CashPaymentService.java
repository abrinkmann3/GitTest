package StatischeFabrik;

public class CashPaymentService implements IPaymentService {

	@Override
	public void pay(Product product) {
		System.out.println("Payed with Cash!");
		
	}

}
