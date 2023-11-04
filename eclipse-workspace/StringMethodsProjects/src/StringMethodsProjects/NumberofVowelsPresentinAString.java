package StringMethodsProjects;



/* This is a small Java Project based on the number of vowels      */



public class NumberofVowelsPresentinAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String str = "Java is fun";

	    boolean isLowerVowel, isUpperVowel;
	    int vowelCount = 0;

	    for (int i = 0; i < str.length(); ++i) {

	      // get index i character
	      char ch = str.charAt(i);

	     // true if the character is a lowercase vowel
	      isLowerVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');

	     // true if the character is an uppercase vowel
	      isUpperVowel = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');

	      if (isLowerVowel || isUpperVowel) {
	        ++vowelCount;
	      }
	    }
	    System.out.println("Vowel Count: " + vowelCount);
	}

}
