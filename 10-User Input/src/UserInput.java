import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Enter a byte value");
//		byte b1=scanner.nextByte();
//		
//		System.out.println("Enter a short value");
//		short s1=scanner.nextShort();
//		
//		System.out.println("Enter a int value");
//		int i1=scanner.nextInt();
//		
//		System.out.println("Enter a boolean");
//		boolean bool=scanner.nextBoolean();
//		
//		System.out.println(b1+"|"+s1+"|"+i1+"|"+bool);
//		
//		scanner.close();
		
		System.out.println("--------------------");
		
		Scanner scanner2=new Scanner(System.in);
		System.out.println("Enter your first number");
		int num1=scanner2.nextInt();
		
		System.out.println("Enter your second number");
		int num2=scanner2.nextInt();
		
		System.out.println(num1+"|"+num2);
		
		scanner2.nextLine();  //do not show first
		
		System.out.println("Provide a String");
		String str=scanner2.nextLine();
		
		System.out.println(num1+"|"+num2+"|"+str);
		
		
		
	}

}
