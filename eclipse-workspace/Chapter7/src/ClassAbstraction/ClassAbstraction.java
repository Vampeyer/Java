package ClassAbstraction;


/* Here , we have created an abstract class Polygon. 
The class contains an abstract method:getArea() and a non- abstract 
method  */

abstract class Polygon {
	  // abstract method
	  abstract void getArea();

	  // regular method
	  void printSides(int side) {
	    System.out.println("This polygon has " + side + " sides.");
	  }
	}

/*  Then we have inherited the Ractangle class from Plygon. AS you can see the 
 rectangle class provides the implementation of the abstract method 
 getArea() */
	class Rectangle extends Polygon {

	  // implement abstract method
	  void getArea() {
	    System.out.println("Area of Rectangle");
	  }
	}




public class ClassAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			    // create object of Rectangle
			    Rectangle obj = new Rectangle();

			    // call regular method
			    obj.printSides(4);

			    // call abstract method
			    obj.getArea();
		
		
	}

};





/* In Java we can create a method that doesnt have a body ,
 * These methods are callad abstract methods for example. , 
 * 
 *    Similar to mehods , we use the abstract 
 *    keyword to declare an abstract class . 
 *     
 *     
 *     
 *     * AN ABSTRACT  class cnanot be instantiated.
 *      THat is, we cannot create objects of an abstract class. 
 *      For example, 
 *      Polygon obj = new Polygon()
 *      
     * Throws an error *      
 *      
 *      _________________________________________________
 *      
 *      
 *      
 *      
 *      *** an abstract method can have noth regular mehtods 
 *      and ABSTRACT methods. For example , */

