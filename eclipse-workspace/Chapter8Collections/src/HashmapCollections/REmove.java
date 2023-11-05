package HashmapCollections;


import java.util.HashMap;

public class REmove {

	public static void main(String[] args) {

	    // create a HashMap
	    HashMap<Integer, String> languages = new HashMap<>();
	    languages.put(1, "Java");
	    languages.put(2, "Python");
	    languages.put(3, "JavaScript");
	    System.out.println("HashMap: " + languages);

	    // remove element associated with key 3
	    String value = languages.remove(3);
	    System.out.println("Removed value: " + value);

	    System.out.println("Updated HashMap: " + languages);
	  }
	}
