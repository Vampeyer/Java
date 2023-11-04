package MethodOverriding;

class Animal {

	  public void makeSound() {
	    System.out.println("Making animal sound");
	  }
	}

	class Dog extends Animal {
	  public void makeSound() {

	    // access makeSound() of the Animal class
	    super.makeSound();
	    System.out.println("Woof woof");
	  }
	}




public class MethodOveridingWithSuperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Dog dog1 = new Dog();
	    dog1.makeSound();
	}

}
