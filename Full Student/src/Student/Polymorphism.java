package Student;

import Student.Animals;
import Student.Cat;
import Student.Dog;

public class Polymorphism {
	
	public static void polyMain(String[] args) {
		
		Animals[] list = new Animals[2];
		Dog d = new Dog();
		Cat c = new Cat();
		
		list[0] = d;
		list[1] = c;
		
		for(Animals x: list)
		{	
			x.noise();
		}
	}

}
