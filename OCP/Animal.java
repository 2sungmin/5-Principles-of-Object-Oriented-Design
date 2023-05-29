package OCP;

public abstract class Animal {
	  abstract void speak();
	}
	class Cat extends Animal { // ���
	    void speak() {
	        System.out.println("�Ŀ�");
	    }
	}
	class Dog extends Animal { // ���
	    void speak() {
	        System.out.println("�۸�");
	    }
	}
	class HelloAnimal {
	    void hello(Animal animal) {
	        animal.speak();
	    }
 }
	class Sheep extends Animal {
	    void speak() {
	        System.out.println("�ſ���");
	    }
	}
	class Lion extends Animal {
	    void speak() {
	        System.out.println("����");
	    }
	}

