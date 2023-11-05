package HashSetCollections;


import java.util.HashSet;
public class HashUnionofSets {

	  public static void main(String[] args) {
		    HashSet<Integer> numbers = new HashSet<>();
		    numbers.add(2);
		    numbers.add(4);
		    System.out.println("Set1: " + numbers);

		    HashSet<Integer> primeNumbers = new HashSet<>();
		    primeNumbers.add(2);
		    primeNumbers.add(3);
		    primeNumbers.add(5);
		    System.out.println("Set2: " + primeNumbers);

		    // Union of two sets
		    numbers.addAll(primeNumbers);

		    System.out.println("Union: " + numbers);
		  }
		}