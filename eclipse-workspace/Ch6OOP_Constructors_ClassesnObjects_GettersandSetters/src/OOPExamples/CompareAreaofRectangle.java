package OOPExamples;

public class CompareAreaofRectangle {
	
	

		  // fields
		  int length, breadth;

		  // constructor
		  CompareAreaofRectangle(int len, int bre) {
		    // initialize variables
		    this.length = len;
		    this.breadth = bre;
		  }

		  // calculate area
		  public int getArea() {
		    int area = this.length * this.breadth;
		    return area;
		  }
		
	
	

		  public static void main(String[] args) {

		    // create object of Rectangle
		    // call constructor with two arguments
			  CompareAreaofRectangle obj = new CompareAreaofRectangle(5, 8);

		    // call the getArea() method
		    System.out.println("Area: " + obj.getArea());
		  };
}

		// Output: Area: 40


