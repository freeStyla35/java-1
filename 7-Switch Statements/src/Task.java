
public class Task {

	public static void main(String[] args) {
		
		char charValue='C';
		switch(charValue) {
		case 'A': case 'B': case 'C': case 'D':
			System.out.println(charValue + " was found");
			break;
		default:
			System.out.println("It was not found");
			break;
		}
	}

}
