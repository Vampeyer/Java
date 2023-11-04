package ClassesBicycleExample;

public class ClassBicycle {
	
	
		  // field
int gear = 5;

// method
void applyBrake() {
  System.out.println("Applying brake.");
};


		  // the main method
		  public static void main(String[] args) {

		    // create object of Bicycle
		    ClassBicycle bike1 = new ClassBicycle();

		    // access fields and methods
		    System.out.println("No. of gears: " + bike1.gear);
		    bike1.applyBrake();
		  
		
		
		
	}

}
