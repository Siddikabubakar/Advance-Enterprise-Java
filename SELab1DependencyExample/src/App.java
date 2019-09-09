
public class App {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustomerId("c001");
		c.setCustomerName("Richard");
		
		CustomerView cv = new CustomerView();
		cv.displayCustomer(c);
	}

}
