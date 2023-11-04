
package ComparisonOperators;
		public class ComparisonOperators {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				/*  In order to learn about decision making , we first need to learn 
				 * and understand comparison operators. 
				 * 
				 *    Comparison operators , compare  the two operands and determines 
				 *    weather or not the comparison results in a truth or a false  result , from the  
				 *    expression.    
				 *     */ 
				int num = 29;
				boolean result = num > 30;
				System.out.println(!result); // a TRUE result , from the NOT - ! -  comparison of a false  -
		       	
				boolean resulter = num >= 30; // Greater then or equal to . 
				System.out.println(!resulter); 
				
				boolean resulter1 = num == 30;
				System.out.println(resulter1);   // Equal to  
				
				boolean resulter2 = num != 30;
				System.out.println(resulter2);   //NOT equal to , setter.   
				    
				
				
				/* Logical Operators    ----   
				 *  Java has three logical operators 
				 *  
				 *  && and , if both conditions are true  
				 *  
				 *  || or , if either , one or the other evaluates as true. 
				 *  
				 *  ! Not , expression , evaluates if expression is false and vice versa  
				 *  
				 *  
				 *  
				 *    */
				
				int theBank = 5000; 
				int theCrypto = 2000; 
				
				
				boolean result1 = (theBank >= 18 && theCrypto>= 1000 ); 
				boolean result2 = (theBank >= 18 || theCrypto>= 1000 ); 
				boolean result3 = !(theCrypto >= 1000 ); 
				System.out.println( " I pledge to science, development,  humanity \n"
						+ " , and engineering to always stay  >  " +  result1 + " to the ways of freedom , \n  as my forefathers taught me.  " );
				
				System.out.println( " I pledge to science, development,  humanity \n"
						+ " , and engineering to always stay  >  " +  result2 + " to the ways of freedom , \n  as my forefathers taught me.  " );
				
				
				System.out.println( " I pledge to science, development,  humanity \n"
						+ " , and engineering to always stay  >  " +  !result3 + " to the ways of freedom , \n  as my forefathers taught me.  " );
				
				
				
			
			}};


