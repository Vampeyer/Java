import java.util.Scanner;





public class takeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub
		Scanner input = new
		Scanner(System.in);
		
		
		/*
		System.out.println("Enter" );
		
		  String straang = input.nextLine();     /* If the String promise here , is placed below the code below , it will not ask for user input , as the promise will break.  
	                          - that is why we will be using the input.next() for string types at the end here ,                     */
//System.out.println("Input Data:" + straang);   
		
		
		
		System.out.println("Enter a any type of  Straang:  ");
	     /* If the String promise here , is placed below the code below , it will not ask for user input , as the promise will break.  
                         - that is why we will be using the input.next() for string types at the end here ,                     */


	String stringz = input.nextLine();
	
	System.out.println("Input Data:  " + stringz );   
		
		
	
		
		
		System.out.println("Enter an integer: ");
		
		int dataInt = input.nextInt(); 
		
		System.out.println("Input Data:" + dataInt); 
		
		
		
		
		System.out.println("Enter an Double: ");
		
		double dataDouble = input.nextDouble(); 
		
		System.out.println("Input Data:" + dataDouble); 
		
		

//		System.out.println("Enter an Straang: \n ");
		
//		  String straang = input.nextLine();    
		
		/* If this code is uncommented 
//		  // and used BELOW the code above ,         
		//, it will break the promise for the string promise above.  
		           
	//	               - that is why we will be using the input.next() for string types at the end here , 
		//                      */
		
//		System.out.println("Input Data:" + straang);   */ 
 		
		//close.Scanner
		input.close();			
		
	}}










/*  
 * Strange unworking code - 
 * 
 * 
 * package takeInput;
//import java.io.InputStream;
import java.util.Scanner;





public class takeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub
		Scanner input = new
		Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int data = input.nextInt(); 
		
		System.out.println(" Data:" + data); 
		
		
		
		System.out.println("Enter a double: ");
		
		double dataDouble = input.nextDouble(); 
		
		System.out.println("Data:" + dataDouble); 
		
		
		
		

		System.out.println("  Enter a String: ");
		
		String dataString = input.nextLine(); 
		
		System.out.println(" Data:" + dataString); 
		
		
		
		//close.Scanner
		input.close();
		
		
	}
	}

 *   
 *   */
