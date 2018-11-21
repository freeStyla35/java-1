
public class Task {

	public static void main(String[] args) {
		
		System.out.println("Sum of the digits in number 125 is " + sumDigits(125));
		System.out.println("Sum of the digits in number -125 is " + sumDigits(-125));
		System.out.println("Sum of the digits in number 4 is " + sumDigits(4));
		System.out.println("Sum of the digits in number 32125 is " + sumDigits(32125));
	}
	
	public static int sumDigits(int number) {
		if(number<10) {
			return -1;
		}
		int sum=0;
		while(number>0) {
			int digit=number%10;
			sum=sum+digit;
			number/=10;
		}
		return sum;
	}

}
