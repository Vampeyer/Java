package CollectionsFramework;

import java.util.ArrayList;

public class ArrayCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
	    // create an ArrayList
	    ArrayList<String> languages = new ArrayList<>();

	    // add() method without the index parameter
	    // TO add items into the array list .  
	    languages.add("Java");
	    languages.add("C");
	    languages.add("Python");
	    
	    // Printing the array list 
	    System.out.println("ArrayList: " + languages);
	    
	    
	    // Adding an element to an array list. 
	    languages.add(0, "JavaScript"); 


	    System.out.println("Update Array list  = " + languages);
		// prints
	    //ArrayList: [Java, C, Python]
	    // access arraylist element
	    String element = languages.get(2);
	    System.out.println("Accessed Element: " + element);
	    
	    
	    
	    
	    // Access elements in an array list
	    String element1 = languages.get(2);
	    System.out.println("Accessed Element: " + element1);


	    
	    // change element at index 1
	    String element2 = languages.set(1, "Kotlin");
	    System.out.println("Updated Arraylist: " + element2);	    
	    
	    
	    
	    
	    // remove element at index 1
	    String element3 = languages.remove(1);
	    System.out.println("Removed Element: " + element3);
	    System.out.println("Updated Arraylist: " + languages);
	    
	    // Primitive Type 
	    System.out.println("ArrayList: " + languages);
	    
	    
	    
	    
	    
	    /* Commonly used Array list methods   
	     * */
	    
	    System.out.println("ArrayList: " + languages.size());
	    
	    
	    
	    String element4 = languages.remove(1);
	    System.out.println("Removed Element: " + element4);
	    System.out.println("Updated Arraylist: " + languages);
	    
	    
	    // sort() 
	    
	    /*contains() Returns a true if the specified element , 
	    is present in the array.  */
	    
	    System.out.println("Tostring  Arraylist =  " + languages.toString());

	    
	    System.out.println("Tostring  Arraylist =  " + languages.toArray());
	    
	    
	    /* clear() removes all of the elements in a list and 
	     * isEmpty() 
	     * 
	     * 
	     *   */
	    
	    
	    
}}
		
	
