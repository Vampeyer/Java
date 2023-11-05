package LinkedListCollections;


/*  MAKE SURE YOU IMPORT THE DAMN THING     */

import java.util.LinkedList;



public class ChangeElementsofLinkedList {
	  public static void main(String[] args) {
		    LinkedList<String> languages = new LinkedList<>();

		    // add elements
		    languages.add("Java");
		    languages.add("Python");
		    languages.add("JavaScript");
		    System.out.println("LinkedList: " + languages);

		    // change the third element
		    languages.set(2, "Kotlin");
		    System.out.println("Updated LinkedList: " + languages);
		  }
		
};