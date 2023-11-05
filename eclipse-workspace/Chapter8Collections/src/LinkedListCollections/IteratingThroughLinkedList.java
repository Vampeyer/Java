package LinkedListCollections;

import java.util.LinkedList;

public class IteratingThroughLinkedList {

	  public static void main(String[] args){

		    LinkedList<String> languages = new LinkedList<>();

		    // add elements
		    languages.add("Python");
		    languages.add("Kotlin");
		    languages.add("Java");
		    System.out.println("LinkedList: " + languages);

		    System.out.println("Access Each Element:  ");

		    // access elements one by one
		    for (String language : languages) {
		      System.out.println(language);
		    }
		  }
		}