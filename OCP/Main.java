package OCP;

public class Main {

	public static void main(String[] args) {
		 HelloAnimal hello = new HelloAnimal();
	        
	        Animal cat = new Cat();
	        Animal dog = new Dog();
	        
	        Animal sheep = new Sheep();
	        Animal lion = new Lion();

	        hello.hello(cat); // �Ŀ�
	        hello.hello(dog); // �۸�
	        hello.hello(sheep); 
	        hello.hello(lion);
	}

}
