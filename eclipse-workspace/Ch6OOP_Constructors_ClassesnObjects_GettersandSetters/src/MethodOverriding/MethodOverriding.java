package MethodOverriding;


class Animal {

	  public void makeSound() {
	    System.out.println("Making animal sound");
	    
	  }
class HavingClass { 
	
}
	  
	}

	class Dog extends Animal {
	}
	
	class NewClass extends Animal{
	  
	}


	/* Method overriding is a  
	 *  important way    */
	
	
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Dog dog1 = new Dog();
	    dog1.makeSound();
	}

}
