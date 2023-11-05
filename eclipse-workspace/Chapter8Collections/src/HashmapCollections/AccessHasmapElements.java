package HashmapCollections;



import java.util.HashMap;

public class AccessHasmapElements {

	public static void main(String[] args) {

	    // create a hashmap
	    HashMap<Integer, String> students = new HashMap<>();

	    // put() method to add elements
	    students.put(1, "Jack");
	    students.put(5, "Jill");
	    students.put(3, "Miller");
	    System.out.println("students: " + students);

	    // getting value of key 5
	    String value = students.get(5);
	    System.out.println("student (key 5): " + value);
	  }
	}