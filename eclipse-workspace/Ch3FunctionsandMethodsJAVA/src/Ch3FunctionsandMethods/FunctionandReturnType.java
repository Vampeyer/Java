package Ch3FunctionsandMethods;

public class FunctionandReturnType {

	  // create a method
	  static int addNumbers(int a, int b) {  // Integer Values are Functionally Declared.
	    int sum;
	    sum = a + b;
	    return sum;
	  }

	  // the main() method
	  public static void main(String[] args) {
	    int result;
	    
	    result = addNumbers(4, 9);
	    /* Calling the function and passing the numbers into it.  */
	    
	    
	    System.out.println(result);  // 13
	  }
}
