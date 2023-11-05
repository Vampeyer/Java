package LinkedListCollections;

import java.util.LinkedList;

public class RemoveElementsfromLinkedList {
	public static void main(String[] args){

	    LinkedList<String> languages = new LinkedList<>();

	    // add elements
	    languages.add("Python");
	    languages.add("Kotlin");
	    languages.add("Java");
	    System.out.println("LinkedList: " + languages);

	    // remove the second element
	    String element = languages.remove(1);
	    System.out.println("Removed Element: " + element);
	    System.out.println("Updated LinkedList: " + languages);
	  }
	}