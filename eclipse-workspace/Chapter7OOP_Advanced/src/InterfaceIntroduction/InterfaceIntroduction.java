package InterfaceIntroduction;



//create an interface
interface Language {
void getName(String name);
}

//implementing the interface in a class
class ProgrammingLanguage implements Language {

// abstract method implementation
public void getName(String name) {
 System.out.println("Language: " + name);
}
}



public class InterfaceIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	    ProgrammingLanguage language = new ProgrammingLanguage();
	    language.getName("Java");
		
		
	}};




/* In Java an interface is a fully abstractive class. 
 * 
 *An interface , 
 *- contians abstract methods 
 *- cannot contain fields  
 *
 *    
 *    All f the abstract methods defined n the interface , 
 *    must be implemented by its subclasses. 
 *    
 *    
 *    In Interface is basically an interface tht defines a set of 
 *    specifications ( Abstract methods  ) 
 *    that other classes must implement; they are similar to protcols. z
 *    
 *    
 *    */
 