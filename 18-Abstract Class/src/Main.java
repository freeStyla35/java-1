
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog("Yorkie");
		dog.breathe();
		dog.eat();
		
//		Bird bird = new Bird("Parrot");
//		bird.breathe();
//		bird.eat();
		
		Parrot p1 = new Parrot("Australian Ringneck");
		p1.breathe();
		p1.eat();
		p1.fly();
		
		Penguin penguin = new Penguin("Emperor");
		penguin.fly();

	}

}
