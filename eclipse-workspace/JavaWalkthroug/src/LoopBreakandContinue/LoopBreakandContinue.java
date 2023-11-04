package LoopBreakandContinue;

public class LoopBreakandContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				// TODO Auto-generated method stub
	// Demonstrating a continue and bresk at 7500 loops .
		
		int BreakingPoint = 7500;
		
				
				System.out.println("    Welcome to the  lucky number machine loop \n"
						+ "this will pront numbers between 4000 to 10000 , with every tenth number a lucky number ! \n"
						+ "This lottery will be shortened , and only draw up to 7500 tonight !    " ); 
				
				System.out.println(" These loops are too fruity , this time I will use \n"
						+ " 5 cups of loops   " ); 
				
				

				
				/*  Continue example   - print even numbers    */

				for (int i = 1; i < 10; i++) { 
					
					// true if number is odd ( not divisible by two  )
					System.out.println("Next digit ");		
					if ( i % 2 != 0) { 
						System.out.println(i + " even numbers , with a call , and continuing the loop "); 
					 continue;
					}
				
					System.out.println(i + " odd numbers" ); 
					}
	System.out.println(" print outside the if block ");			
	
	
	int SomeNumber = 4000;
	while(SomeNumber <= 10000) {
		System.out.println("Going up , --- Yout number is" + SomeNumber );	
	++SomeNumber;
	if(SomeNumber == BreakingPoint) {
		System.out.println("Broke at 7500 ! ");
		break;
	}else if(SomeNumber % 10 == 0) {
		System.out.println(" Your lucky tenth number is " + SomeNumber );
		continue;

	
	}}};
	
	
	
	};  

	


	



