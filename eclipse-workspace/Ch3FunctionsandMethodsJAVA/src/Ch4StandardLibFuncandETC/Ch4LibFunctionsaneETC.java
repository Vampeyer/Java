package Ch4StandardLibFuncandETC;

public class Ch4LibFunctionsaneETC {
	
	
	/*Declaring the functions first  up here -    */
	  // method to add numbers
	  static int addNumbers(int a, int b) {
	    return a + b;
	  }

	  // method to multiply numbers
	  static int multiplyNumbers(int a, int b) {
	    return a * b;
	  }
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    int number = 25;
	    double squareRoot;

	    squareRoot = Math.sqrt(number);
	    System.out.println(squareRoot);  //computes the square root of the integer. 
	    
	    double power = Math.pow(5.5, 2);
	    System.out.println(power);        /// computer the integer pf the power
	
	
	



	    int sum, product;

	    sum = addNumbers(4, 5);
	    System.out.println("Sum: " + sum);

	    product = multiplyNumbers(4, 5);
	    System.out.println("Product: " + product);
	  
	
	}
};
		
	
	/*add and multiply teo numbers togetyher   
	 * 
	 *     */ 
	
	
	
	
	
	
	
	
	





/*   Stand ard library mehtods are built in methods that can be directly 
 * used in our program  .  
 * 
 *   Fpr Example  - 
 *   
 *   println() used to print a string   . 
 *   sqrt() ;  computes the square root of a number.
 *   
 *  */