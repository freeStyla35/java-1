
public class Dog2 {
	
	public String name;
	public int age;
	public String breed;
	public String color;
	
//	public Dog2() {
//		System.out.println("Default Constructor");
//	}
	
	public Dog2() {
		//this("a",3,"v","x");
		//System.out.println("Calling no paramter constructor");
		name="Hunter";
		age=5;
		breed="Bulldog";
		color="Brown";
	}
	
	public Dog2(String dogName,int dogAge,String dogBreed,String color) {
		//this();
		name=dogName;
		age=dogAge;
		breed=dogBreed;
		this.color=color;
	}

}
