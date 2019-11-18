package StatischeFabrik;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> productList = new ArrayList<Product>();
	private IPaymentService paymentService;

	public ShoppingCart(IPaymentService service) {
		this.paymentService = service;
	}
	
	public IPaymentService createCashPaymentService(IPaymentService service) {
		return new CashPaymentService();
		
	}
	public IPaymentService createCreditcardPaymentService(IPaymentService service) {
		return new CreditcardPaymentService();
		
	}

	public void addProductToCart(Product product) {
		productList.add(product);
	}

	public void buy() {
		productList.stream().forEach(paymentService::pay);
	}

}


