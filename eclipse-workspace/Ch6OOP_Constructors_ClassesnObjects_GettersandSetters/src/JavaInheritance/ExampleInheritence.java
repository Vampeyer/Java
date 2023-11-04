package JavaInheritance;


 /* Inheritence is used for making seperate classes from one class. 
  * 
  *  
  *  
  *  */



class Animal {
	  String name;

	  public void eat() {
	    System.out.println("I am an animal");
	    System.out.println("I can eat");
	    
	  }
	  
class ClassyClass{ 
	public void classyHat() {
		System.out.println("This is my classy hat");
	}}
class Titties extends Animal{ 
		public void ClassyShirt() { 
		  	System.out.println("You have a classy hat" );
		  	
		}}
		class Shirt extends Animal { 
			public void displayT() { 
				System.out.println(" Right here  ");
			
		}
	} 
	
	
	
};
	

	class Dog extends Animal {
	  public void display() {
	    System.out.println("My name is " + name);
	  }
	}


public class ExampleInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleInheritence shirts = new ExampleInheritence();	    // create an object of the subclass
	    Dog dog1 = new Dog();

	    // access inherited superclass members
	    dog1.name = "Fenton";
	    dog1.eat();

	    dog1.display();
	}

}




