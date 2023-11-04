package Ch5Stringz;

public class StringMethods {
	public static void main(String[] args) {
/*JAVA has  several string methods readily available for us to use , 
 * 
 *  This makes working with strings much easier. 
 *  
 *  In this lesson we will learn about the most commonly used methods. 
 *  
 *  
 *  length() - finds the length of a string  
 *  charAt() - get a character from a string, 
 *  concat()   joins  two strings 
 *  replace() - replaces characters of a string.   
 *  
 *  
 *  */
	
	
//length() method  in sction , showing the length of the string. 
	
		// TODO Auto-generated method stub


	    String name = "Programiz";

	    // find string's length
	    int length = name.length();
	    System.out.println("Size: " + length);
	 
// charAt() method in action , by passing the number in as an argument.  
	

	    // character at the first position
	    System.out.println(name.charAt(0));  // P

	    // character at the sixth position
	    System.out.println(name.charAt(5));  // a

	    // character at the fourth position
	    System.out.println(name.charAt(3));  // g
	  
	
/*   The concat method concatenates or joins two strings. 
 * concat() methos in action , concatenating two strings.   */
    // create strings
	    String str1 = "Java ";
	    String str2 = "Programming";
	    System.out.println("Second String:");
	    // print two strings
	    System.out.println("First String: " + str1);
	    System.out.println("Second String: " + str2);

	    // join two strings
	    String joinedString = str1.concat(str2);   // concatenating the two strings , and 
	    System.out.println("Joined String: " + joinedString); // displaying the concatenated variable. 

    
    
    
    
/* The equals() method returns true if two strings are equal.  */
    // create strings
	    String str11 = "Learn Java";
	    String str22 = "Learn Kotlin";
    
    // comparing str1 and str2
	    System.out.println(str11.equals(str22));

	    if (str1.equals(str22)) {
	    	System.out.println("Equal strings");
	    }
	    else {
	    	System.out.println("Non-equal strings");
	    }
    
    
    
    
    
/* The replace() method replaces each matching character with a new charater.   */
	    // create strings
	    String text = "Lava Lob";
	    System.out.println("Old Text: " + text);

		    // replace L with J
	    text = text.replace('L', 'J');
	    System.out.println("New Text: " + text);
  
    
	    
	    
	     //
	     // Next up , is comparisons with strings , using the == operator. 
    

	    // create string
	    String stri1 = "Learn Java";
	    String stri2 = "Learn Java";

	    if(stri1 == stri2) {
	      System.out.println("Equal Strings");
	    }
	    else {
	      System.out.println("Non-equal Strings");
	    }
	    
	}
	};
	
	


