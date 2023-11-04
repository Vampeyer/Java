package ChapterTwoBAsicJava;

public class Array2CopyarrStringarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // create an array
		
// COPYING ONE ARRAY TOO ANOTHER 		
	    int[] data1 = {1, 3, 5, 7};

	    // copy data1 array to another array
	    int[] data2 = data1;

	    // print data2
	    System.out.print("data2 = ");
	    for(int data : data2) {
	      System.out.print(data + ", ");
	    }


	// Output: data2 = 1, 3, 5, 7,
	    
	    
	    
	    
	    
	    
	    // String Array 
	    
	    String[] languages = {"Java", "Python", "C"};

	    // print string array
	    System.out.print("Languages: ");
	    for(String lang : languages) {
	      System.out.print(lang + ", ");
	    }
	    
	    
	}

}
