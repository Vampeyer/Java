package iterateThroughArrayList;

import java.util.ArrayList;



public class IterateArrayList {

	public static void main(String[] args) {
		/* Here we are creating an 
	     ArrayList<String> and declaring it to be languages. 
	    
	   We are then declaring the languages
	    variable to be languages.
	   
	   
	      
	    */
		
		    ArrayList<String> languages = new ArrayList<>();

		    // add elements to the languages , array list. 
		    languages.add("Python");
		    languages.add("Kotlin");
		    languages.add("Java");
	

		    System.out.println("ArrayList Elements:  ");
		    System.out.println("ArrayList: " + languages);
		    // access elements one by one
		    for (String language : languages) {
		      System.out.println(language);

	};
	}
}



