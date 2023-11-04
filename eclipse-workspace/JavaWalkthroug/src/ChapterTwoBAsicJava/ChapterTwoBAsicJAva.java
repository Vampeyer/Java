package ChapterTwoBAsicJava;

public class ChapterTwoBAsicJAva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* Now we will learn about arrays which will allow us too store multiple values at once   */ 
		/* 
		 * CrInitialize arrays with values 
		 * access arrays 
		 * modify array elements  
		 *  */
		
		
		  //Declare an array. 
		int[] data; 
		//allocate memory. 
		data = new int[4]; // Now , the array can store 4 elements . 
		
		//
		
		/*of the int type . 
		
		initialize an array */ 
		int[] data2 = {29,38,52};
		
		/* The size of the array is 3  */ 		
		
		
		
		System.out.println(data2 + " First element  =  " + data2[0] + "\n"
				+ "second elemtnt = " + data2[1] + " \n"
						+ "THird element = " + data2[2]);
		
		
		
		/* Print all array elements in a for loop  - */ 
			    // create an array
			    int[] dataa = {12, 19, 2, 8};

			    // loop through each elements
			    for (int i = 0; i < 4; ++i) {
			      System.out.println(dataa[i]);
			    }
		
				/*    Modify Array elements     */
                 
			     int[] dayta = {  12, 19, 22, 8, 3};
			     System.out.println(dayta); // mem addy 
			     dayta[2] = 10;
			     dayta[4] = 100;
		
			     for (int i = 0; i <= 4; ++i) {
				      System.out.println(dayta[i]);
				    
			     System.out.println(dayta);
        		
		/*  FINDING THE SIZE OF AN ARRAY      */
		

			     // create an array
			     int[] marks = {2, 3, 5, 7, 11};

			     // get size of the array
			     int size = marks.length;

			     System.out.println("Size = " + size);
			     
			     
			     
			     
			     }
	}

}
