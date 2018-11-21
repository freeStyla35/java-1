
public class Main {

	public static void main(String[] args) {
		
		//ITTelephone mikePhone = new ITTelephone();
		DeskPhone mikePhone2 = new DeskPhone(2022020202);
			
		ITelephone mikePhone;
		mikePhone = new DeskPhone(202202202);
		mikePhone.powerOn();
		mikePhone.callPhone(12345);
		mikePhone.answer();
		
		mikePhone = new MobilePhone(23920202);
		//mikePhone.powerOn();
		mikePhone.callPhone(23920202);
		mikePhone.answer();
		
		
		
	}

}
