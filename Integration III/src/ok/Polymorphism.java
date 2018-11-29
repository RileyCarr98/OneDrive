package ok;

public class Polymorphism {
	
	public static void main(String[] args) {
		
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
