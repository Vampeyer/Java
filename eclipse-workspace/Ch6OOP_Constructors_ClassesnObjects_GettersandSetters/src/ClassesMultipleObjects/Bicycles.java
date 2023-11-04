package ClassesMultipleObjects;

public class Bicycles {

		// TODO Auto-generated method stub
		  // field
		  int gear = 5;

		  public static void main(String[] args) {

		    // create multiple objects of Main
		    Bicycles bike1 = new Bicycles();
		    Bicycles bike2 = new Bicycles();

		    // access field using both objects
		    System.out.println(bike1.gear);    // 5
		    System.out.println(bike2.gear);    // 5

		    // change value of gear
		    bike1.gear = 6;
		    bike2.gear = 4;

		    // print new values
		    System.out.println(bike1.gear);    // 6
		    System.out.println(bike2.gear);    // 4
		  
	}

}
