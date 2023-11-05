package LinkedListCollections;


import java.util.LinkedList;

public class AccessElementsFromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    LinkedList<String> languages = new LinkedList<>();

	    // add elements
	    languages.add("Python");
	    languages.add("Java");
	    languages.add("JavaScript");
	    System.out.println("LinkedList: " + languages);

	    // get the element
	    String str = languages.get(1);
	    System.out.print("Element at index 1: " + str);
		
		
		
		
	}

}
