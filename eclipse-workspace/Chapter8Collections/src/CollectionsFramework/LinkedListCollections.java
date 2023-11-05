package CollectionsFramework;



/*Make sure to import the Linked List !      */
import java.util.LinkedList;



public class LinkedListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // create a LinkedList
	    LinkedList<String> languages = new LinkedList<>();

	    // add elements
	    languages.add("Java");
	    languages.add("C");
	    languages.add("JavaScript");
	    System.out.println("LinkedList: " + languages);

	    // add elements at the specified index
	    languages.add(1, "Python");
	    System.out.println("Updated  LinkedList: " + languages);
	  }
	}