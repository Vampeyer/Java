
public class LoopsBreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//  BREAK statements , always come with another if statement. 
		   /* another if statement , that validates whenever the comparison operator 
              in that statement is true , and BREAKs the loop and stops it at said stopping point		
		*/
		
		// For example 
		
		
		System.out.println(" These loops are too fruity , stop them"
				+ "  from going on a loping spree ,  at 4  " ); 
		
		for( int num1 = 0; num1 <= 10;num1++) { 
			System.out.println("Fruity Loops number " + num1  ); 
			if (num1 == 3) { 
				System.out.println("Broke the loop on number 4"  ); 
				break;
		}
		
		}
		
		
		   // do while 
			int number1 = 1;
			do {  
			System.out.println(number1 + " is doin The numbered do loop "  ); ++number1;  } 
			while (number1 < 10 );  
		};
		
		
		
		
		
		
		
		
	}


