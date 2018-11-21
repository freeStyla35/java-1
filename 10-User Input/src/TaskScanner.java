import java.util.Scanner;

public class TaskScanner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum=0;
		int counter=1;
		while(counter<11) {
			System.out.println("Enter your number-"+counter);
			if(scanner.hasNextInt()) {
				int number=scanner.nextInt();
				counter++;
				sum=sum+counter;
			}else {
				System.out.println("invalid number");
			}
			//scanner.nextLine();
		}
		System.out.println(sum);
		scanner.close();

	
		
		
	}

}
