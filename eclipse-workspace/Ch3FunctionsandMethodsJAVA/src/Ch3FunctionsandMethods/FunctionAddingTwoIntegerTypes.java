package Ch3FunctionsandMethods;

public class FunctionAddingTwoIntegerTypes {

	  // create a method
	  static void addNumbers(int a, int b) {
	    int sum = a + b;
	    System.out.println(sum);
	  }
	  static double addNumbers(double a, double b) {
		    double sum = a + b;
		    return sum;
		  }
	  
	  

	  // the main() method
	  public static void main(String[] args) {
	    addNumbers(2, 3);
	    
	    double result;
	    result = addNumbers(4.5, 9.6);
	    System.out.println(result);  // 14.1

	    result = addNumbers(-15.4, 10.0);
	    System.out.println(result);  // -5.4
	    
	  }

}
