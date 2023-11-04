
public class LoopBreakwithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

			
		/* Just use a while with a if inside for a break !    */
		
		int IntegerValue = 200;
		
		
		// Making a loop infinite until a 539 stop marker. 
		

		while(IntegerValue > 150) {
			System.out.println(" Extremely powerful code , Terminate program to stop. - Your number is   " + IntegerValue  );
		 if (IntegerValue >= 539 ) { 
			 System.out.println( "Broke it at 539 ");
			 break;
		 }
		 ++IntegerValue;
		}
			// initiating a break for the while loop here 
		
		};
		
		
		
	}



















/*

//***** do while cannot do this in java !!!!!!!!!******* 
	int number1 = 1;
	do {  
	System.out.println(number1 + " is doin The numbered do loop "  ); ++number1;  } 
	while (number1 < 10 );
	
	*/
	




