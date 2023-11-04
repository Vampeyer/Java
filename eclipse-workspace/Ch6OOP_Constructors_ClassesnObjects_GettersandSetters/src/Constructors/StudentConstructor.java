package Constructors;

public class StudentConstructor {


	

			  String name;
			  int id;

			  // constructor
			  StudentConstructor() {
			    System.out.println("Initializing values: ");
			    name = "NA";
			    id = -1;
			  }

			  public static void main(String[] args) {

			    // creating an object
			    StudentConstructor s1 = new StudentConstructor();

			    System.out.println("Name: " + s1.name);
			    System.out.println("Id: " + s1.id);

			  }
			
		
	}


