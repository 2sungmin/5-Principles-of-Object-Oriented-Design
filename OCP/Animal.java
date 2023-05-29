package OCP;

public abstract class Animal {
	  abstract void speak();
	}
	class Cat extends Animal { // 惑加
	    void speak() {
	        System.out.println("衬克");
	    }
	}
	class Dog extends Animal { // 惑加
	    void speak() {
	        System.out.println("港港");
	    }
	}
	class HelloAnimal {
	    void hello(Animal animal) {
	        animal.speak();
	    }
 }
	class Sheep extends Animal {
	    void speak() {
	        System.out.println("概俊俊");
	    }
	}
	class Lion extends Animal {
	    void speak() {
	        System.out.println("绢蕊");
	    }
	}

