package CollectionsFramework;



/*MAKE SURE TO IMPORT THE ARRAY LIST TO USE IT !    */
import java.util.ArrayList;


public class IterateThroughArrayList {  
	public static void main(String[] args){


    ArrayList<String> languages = new ArrayList<>();

    // add elements
    languages.add("Python");
    languages.add("Kotlin");
    languages.add("Java");
    System.out.println("ArrayList: " + languages);

    System.out.println("ArrayList Elements:  ");

    // access elements one by one
    for (String language : languages) {
      System.out.println(language);
    }
  }};