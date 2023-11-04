package AssignmentArithmeticOperators;

public class AssignmentArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// = is the assignmtn operator 
		
	    String newString = " Assigned string stream value";
		
	    // Assign one variable to another 
	    
	    int num1 = 10, num2 = 20;
	    num1 = num2;
	    System.out.println(num2);
	    
	    
	    
	    // Arithmetic is for arithmetic operators. , for doing math. 
	    
	    //+ Operator  
	    
	    int aInt = 1;
	    int bInt = 9000;
	    int sum1 = 12 + 0; 
	    
		System.out.println(" Your power level may be " +  aInt + sum1 + " But mine is over " +  bInt);
	    
	   
		
	   // the minus and multiplication Operators , - and  * 
		double a = 34.4; 
		double b = 12.9;
		
		double difference = a - b; // Subtraction 
		double product = (a) * (b);
		
		
		System.out.println(difference + "   " + product  );
		
		
		
		
		//   /  and % Operators ,   division , and remainder operators. 
		
		double dividedNumber =  a / b;
		
		double remainderNumber = a % b; // Shows a more accurate remainder number. 
		
		//  ALWAYS USE A DOUBLE FOR DIVISION , A INT CANNOT BE DEVIDED , PAST A WHOLE NUMBER !  
		
		System.out.println("Divided number = " +  dividedNumber + " remainder number  =  " + remainderNumber);
		
		
		System.out.println(a); // = 34.4
		// compund operators , 
		a +=b;a-=b;a/=+b;
	    a *= b;
		System.out.println(a);// = 34.4
	
		
		// ALSO the ++increment and --decrement values  
		++a;++a;++a;++a;++a;++a;
		System.out.println(a); // = 40.4 
		--a;--a;--a;--a;--a;--a; // = 34.4
		System.out.println(a);
		
	
	}

}
