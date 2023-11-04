
package AbstractMethods;



 

abstract class Polygon {
	  // abstract method
	int TempArea = 16;
	  abstract void getArea();
	  

	  // regular method
	  void printSides(int side) {
	    System.out.println("This polygon has " + side + " sides.");
	  }
	}

	class Rectangle extends Polygon {

	
	  // implement abstract method
	  void getArea() {
	    System.out.println("Area of Rectangle is " + TempArea + " Feet");
	  }
	};





	public class AbstractMethods {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
	    // create object of Rectangle
	    Rectangle obj = new Rectangle();

	    // call regular method
	    obj.printSides(4);

	    // call abstract method
	    obj.getArea();
		
	}};
	
	


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
 *      and ABSTRACT methods. For example , 
 *      
 *      
 *      
 *      
 *     
 *     */ 

	
	

