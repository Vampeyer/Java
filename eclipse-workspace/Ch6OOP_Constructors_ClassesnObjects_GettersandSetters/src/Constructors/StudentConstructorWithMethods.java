package Constructors;

public class StudentConstructorWithMethods {

	
		// TODO Auto-generated method stub

		  String name;
		  int id;

		  // constructor with parameters
		  StudentConstructorWithMethods(String student_name, int id) {
		    this.name = student_name;
		    this.id = id;
		  }

		  public static void main(String[] args) {

		    // pass value to constructor
			  StudentConstructorWithMethods s1 = new StudentConstructorWithMethods("Alex", 1);
			  StudentConstructorWithMethods s2 = new StudentConstructorWithMethods("Mary", 5);

		    // printing fields
		    System.out.println("student1 name: " + s1.name);
		    System.out.println("student1 id:" + s1.id);

		    System.out.println("student2 name: " + s2.name);
		    System.out.println("student2 id:" + s2.id);
		  }};
		

		  
		  /*  OUTPUT 
		   * 
		   *   
student1 name: Alex
student1 id:1
student2 name: Mary
student2 id:5
		   *   
		   *   
		   *   */
