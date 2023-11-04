package Ch4StandardLibFuncandETC;

public class FindtheSumofNumbers {
	
	
	
	
	
	  // method to find the sum of natural numbers
	  static int calculateSum(int number) {
	    int sum = 0;

	    for (int i = 1; i <= number; ++i) {
	      sum += i; // sum = sum + i;
	    }

	    return sum;
	  }
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		



		
		    int limit = 10;
		    int result =  calculateSum(limit);

		    System.out.println("Result: " + result);  // 55
		  
		
		
	}

}
