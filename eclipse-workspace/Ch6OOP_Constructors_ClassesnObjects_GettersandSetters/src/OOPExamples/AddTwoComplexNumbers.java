package OOPExamples;

public class AddTwoComplexNumbers {

	

		  private double real;
		  private double imag;

		  // initialize real and imag
		  public AddTwoComplexNumbers(double real, double imag) {
		    this.real = real;
		    this.imag = imag;
		  }

		  // take a Complex object as argument
		  // returns a Complex object
		  public AddTwoComplexNumbers add(AddTwoComplexNumbers n2) {

			  AddTwoComplexNumbers temp = new AddTwoComplexNumbers(0.0, 0.0);

		    temp.real = this.real + n2.real;
		    temp.imag = this.imag + n2.imag;

		    return temp;
		  }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddTwoComplexNumbers n1, n2, result;

	    // create two Complex objects
	    n1 = new AddTwoComplexNumbers(2.9, 4.5);
	    n2 = new AddTwoComplexNumbers(3.1, 5.0);

	   // add complex numbers
	    result = n1.add(n2);

	    System.out.println("Sum = " + result.real + " + " + result.imag + "i");
	  }
		
	};


