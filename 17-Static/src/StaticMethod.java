
public class StaticMethod {
	
	public static void main(String[] args) {
		
		Abc x = new Abc();
		x.show();
		
		x.i=5;
		
		Abc.show();
		//Abc.i=5;
		 
		
		
	}

}

class Abc{
	
	 int i;
	
	public static void show() {
		System.out.println("Hi");
		//show2();
		show4();
	}
	
	public void show2() {
		System.out.println("Hi");
		show();
	}
	
	public void show3() {
		System.out.println("Hi");
		show2();
		show();
	}
	
	public static void show4() {
		System.out.println("Hi");
	}
	
	
	
	
}
