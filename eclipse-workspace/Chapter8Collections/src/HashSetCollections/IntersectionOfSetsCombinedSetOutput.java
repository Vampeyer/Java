package HashSetCollections;

import java.util.HashSet;



public class IntersectionOfSetsCombinedSetOutput {
	  public static void main(String[] args) {
		    HashSet<Integer> primeNumbers = new HashSet<>();
		    primeNumbers.add(2);
		    primeNumbers.add(3);
		    primeNumbers.add(5);
		    System.out.println("Set1: " + primeNumbers);

		    HashSet<Integer> oddNumbers = new HashSet<>();
		    oddNumbers.add(1);
		    oddNumbers.add(3);
		    oddNumbers.add(5);
		    System.out.println("Set2: " + oddNumbers);

		    // Intersection of two sets
		    oddNumbers.retainAll(primeNumbers);
		    System.out.println("Intersection: " + oddNumbers);
		  }
		}