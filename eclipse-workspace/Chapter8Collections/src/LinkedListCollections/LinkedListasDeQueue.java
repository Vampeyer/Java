package LinkedListCollections;


import java.util.LinkedList;

public class LinkedListasDeQueue {

	  public static void main(String[] args) {
		  
		  
		    LinkedList<String> languages = new LinkedList<>();

		    // add elements
		    languages.add("Python");
		    languages.add("Java");
		    languages.add("JavaScript");
		    System.out.println("LinkedList: " + languages);

		    // remove elements from the front
		    String str1 = languages.poll();
		    String string1 = "Add first  ";
		    

		    String string2 = "Add Last";
		    
		    String string3 = "Remove First ";
		    
		    String string4 = "Remove Last ";
		    
		    
		    
		    
            System.out.println(languages);
		    //
		    // print the removed element
		    System.out.println("Removed Element: " + str1);

		    System.out.println("LinkedList after poll(): " + languages);

		    // add element at the back
		    languages.offer("Swift");
		    System.out.println("LinkedList after offer(): " + languages);
		  
	  
	        languages.addFirst(string1);
		    System.out.println("LinkedList after addFirst(): " + languages);
			  
		    languages.addLast(string2);
		    System.out.println("LinkedList after addLast(): " + languages);
			  
		    languages.removeFirst();
		    System.out.println("LinkedList after removeFirst(): " + languages);
			  
		    languages.removeLast();
		    System.out.println("LinkedList after removeLast(): " + languages);
			  
		    
	  
	  }
}


