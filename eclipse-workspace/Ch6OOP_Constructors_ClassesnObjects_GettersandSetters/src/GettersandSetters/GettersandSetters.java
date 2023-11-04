package GettersandSetters;

public class GettersandSetters {
 
		  int a;

		  GettersandSetters(int a) {
		    this.a = a;

		    // print this keyword
		    System.out.println("this reference = " + this);
		  }

		  public static void main(String[] args) {

		    // call the constructor
			  GettersandSetters obj = new GettersandSetters(8);

		    // print the object
		    System.out.println("object reference = " + obj);
		  
		}};

