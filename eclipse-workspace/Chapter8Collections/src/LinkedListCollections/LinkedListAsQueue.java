package LinkedListCollections;

import java.util.LinkedList;

public class LinkedListAsQueue {

	  public static void main(String[] args) {
		    LinkedList<String> languages = new LinkedList<>();

		    // add elements
		    languages.add("Python");
		    languages.add("Java");
		    languages.add("JavaScript");
		    System.out.println("LinkedList: " + languages);

		    // remove elements from the front
		    String str1 = languages.poll();

		    // print the removed element
		    System.out.println("Removed Element: " + str1);

		    System.out.println("LinkedList after poll(): " + languages);

		    // add element at the back
		    languages.offer("Swift");
		    System.out.println("LinkedList after offer(): " + languages);
		  }
		}