package Statical;


public class Statical {
	
	class Student {

		  // static field
		  static String subject;

		  // static field
		  static void displaySubject() {
		    System.out.println("Subject: " + subject);
		  }
		}


					/*   So9metimes we want fields and methods that are common to all objects 
					 * of a class , we can use the static keywod to create static fields and methods. 
					 * 
					 *  */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // access the static field/method
	    Student.subject ="Computer Science";
	    Student.displaySubject();

	}};
	
	
	/* The static fields and methods are associated with a class, 
	 * (rather than an objects) , and we use a 
	 * CLASS name , to access them.     */
	
	
