package StringMethodsProjects;

public class CheckifASubstringNumberIsPresent {

	
	/*  In this project , we are checking to see ,  
	 * 
	 *     if a subset of a string is  or s not present , in another larger string we provide. */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // create string
	    String text = "This is Java Programming.";
	    String subString = "Java";

	    // check if subString is present in text
	    boolean result = text.contains(subString);

	    if (result) {
	      System.out.println("Substring is present.");
	    }
	    else {
	      System.out.println("Substring is not present.");
	    }
		
		
		
	}

}
