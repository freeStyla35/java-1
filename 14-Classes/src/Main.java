
public class Main {

	public static void main(String[] args) {
		
//		Dog dog1 = new Dog();
//		dog1.name="Bubbly";
//		dog1.age=10;
//		dog1.breed="Poodle";
//		dog1.color="White";
//		
//		System.out.println(dog1.name + ":" + dog1.age + ":" + dog1.breed + ":" + dog1.color);
//		dog1.bark();
//		dog1.eat();
//		dog1.wagTail();
		
		System.out.println("--------");
		
		Dog2 dog1 = new Dog2();
		System.out.println(dog1.name + ":" + dog1.age + ":" + dog1.breed + ":" + dog1.color);

		Dog2 dog2 = new Dog2("Bubbly",10,"Poodle","White");
		System.out.println(dog2.name + ":" + dog2.age + ":" + dog2.breed + ":" + dog2.color);

		System.out.println("--------");
		
//		TaskConstructor student1 = new TaskConstructor("Mike", 20, 'M', "JAVA", 2017, "Cybertek");
//		student1.attendLecture();
		
		TaskConstructor student1 = new TaskConstructor("Mike", 20, 'M', "JAVA", 2017);
		student1.attendLecture();
		
		TaskConstructor student2 = new TaskConstructor("Tom", 19, 'F', "JAVASCRIPT", 2017);
		student2.attendLecture();
		

		
	}

}
