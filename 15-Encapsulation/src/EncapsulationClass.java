
public class EncapsulationClass {

	public static void main(String[] args) {
		
		Car porsche = new Car();
		porsche.setModel("911");
		System.out.println("Model is: " + porsche.getModel());
		
		System.out.println("---------------");
		
		Task mikeAccount = new Task();
		mikeAccount.setAccountNumber("555555");
		mikeAccount.setAccountBalance(2.5);
		mikeAccount.setCustomerName("Mike");
		
		mikeAccount.withdrawal(100.0);
		
		mikeAccount.deposit(50.0);
		mikeAccount.withdrawal(100.0);
		
		mikeAccount.deposit(51.0);
		mikeAccount.withdrawal(100.0);
		
		System.out.println(mikeAccount.getAccountNumber());
		System.out.println(mikeAccount.getAccountBalance());
	}

}
