package StatischeFabrik;

public class CreditcardPaymentService implements IPaymentService {

	@Override
	public void pay(Product product) {
		System.out.println("Payed with Creditcard!");
		
	}

}
