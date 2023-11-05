package ClassExtensions;

// Here , first we are creating an animal class , 


class Animal {
	public void display() { 
		System.out.println("Animal Class");
}
	
}
//Then we are extending that class within a Dog class 		
class Dog extends Animal {
	public void display()
 { 
		System.out.println("Dog Class");
 }};
	




public class ClassExtensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog();
		d1.display();
	}
}
