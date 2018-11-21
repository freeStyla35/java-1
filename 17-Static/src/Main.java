
public class Main {

	public static void main(String[] args) {
		
		StaticTest static1 = new StaticTest("instance-1");
		System.out.println(static1.getName() + " is instance number " + static1.getNumInstances());

		StaticTest static2 = new StaticTest("instance-2");
		System.out.println(static2.getName() + " is instance number " + static2.getNumInstances());
		
		StaticTest static3 = new StaticTest("instance-3");
		System.out.println(static3.getName() + " is instance number " + static3.getNumInstances());

	}
}
