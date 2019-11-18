package StatischeFabrik;

public class TestKlient {
	
	public static void main(String []args) {
		Product tester1 = new Product("Cookies",1234,2.59);
		Product tester2 = new Product("Chocolate-Cookies",1223,2.99);
		Product tester3	= new Product("AppleJuice", 3456, 1.99);
		Product tester4 = new Product("Nutella", 6728, 2.89);
		
		ShoppingCart s1 = new ShoppingCart(new CashPaymentService());
		ShoppingCart s2 = new ShoppingCart(new CreditcardPaymentService());
		
		s1.addProductToCart(tester2);
		s1.addProductToCart(tester3);
	
		s2.addProductToCart(tester1);
		s2.addProductToCart(tester4);
		
		s1.buy();
		System.out.println();
		s2.buy();
	}

}
