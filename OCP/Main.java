package OCP;

public class Main {

	public static void main(String[] args) {
		 HelloAnimal hello = new HelloAnimal();
	        
	        Animal cat = new Cat();
	        Animal dog = new Dog();
	        
	        Animal sheep = new Sheep();
	        Animal lion = new Lion();

	        hello.hello(cat); // ³Ä¿Ë
	        hello.hello(dog); // ¸Û¸Û
	        hello.hello(sheep); 
	        hello.hello(lion);
	}

}
