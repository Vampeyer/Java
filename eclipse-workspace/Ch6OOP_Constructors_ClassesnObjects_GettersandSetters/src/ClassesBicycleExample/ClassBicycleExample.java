package ClassesBicycleExample;

public class ClassBicycleExample {
	  // field
	  int gear = 5;

	  // method
	  void applyBrake() {
	    System.out.println("Applying brake.");
	  }
	
	class Bicycle {

	

		  // the main method
		  public static void main(String[] args) {

		    // create object of Bicycle
			  ClassBicycleExample bike1 = new ClassBicycleExample();

		    // access fields and methods
		    System.out.println("No. of gears: " + bike1.gear);
		    bike1.applyBrake();
		  }
		}
}
		
	
	
	


