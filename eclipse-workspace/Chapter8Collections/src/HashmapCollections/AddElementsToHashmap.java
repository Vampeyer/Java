package HashmapCollections;


import java.util.HashMap;

public class AddElementsToHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // create a hashmap
	    HashMap<Integer, String> students = new HashMap<>();
	    System.out.println("Initial HashMap: " + students);

	    // put() method to add elements
	    students.put(1, "Jack");
	    students.put(5, "Jill");
	    students.put(3, "Miller");
	    System.out.println("Updated HashMap: " + students);
	  }
	}
