package AccessConstructorofSuperclass;



interface Animal {
	  public void printAnimalTraits();
	}

	interface Mammal {
	  public void printMammalTriats();
	}

	class Dog implements Animal, Mammal {
	  // implement printAnimalTraits()
	  public void printAnimalTraits() {
	    System.out.println("Can eat.");
	  }

	  // implement printMammalTriats()
	  public void printMammalTriats() {
	    System.out.println("Warm blood.");
	  }
	}
public class AccessConstructorsofSuperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Dog dog1 = new Dog();
        System.out.println("My Dog \n ");
	    dog1.printAnimalTraits();
	    dog1.printMammalTriats();
	}

}
