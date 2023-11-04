package InterpolatedValues;

public class JAVAInterpolation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		


		
		/*  Interpolated values in JAVA  
		 * 
		 *    There are a few ways to do interpolated value in
		 *     Java.

1. Using the String.format() method

The String.format() method allows you to format a string using a 
format string. The format string can contain placeholders for 
variables, which will be replaced with the values of the 
variables when the string is formatted.

For example, the following code interpolates 
the value of the name variable into the string:

Java
String name = "John Doe";
String message = String.format("Hello, %s!", name);
Use code with caution. Learn more
The message variable will now contain the string 
"Hello, John Doe!".

You can also use the String.format() method to 
interpolate multiple values into a string. For example, 
the following code interpolates the values of the name and
 age variables into the string:

Java
String name = "John Doe";
int age = 30;
String message = String.format("Hello, %s! You are 
%d years old.", name, age);
Use code with caution. Learn more
The message variable will now contain the string "Hello,
o John Doe! You are 30 years old.".

2. Using the MessageFormat class

The MessageFormat class is a more powerful way to format
 strings than the String.format() method. It allows you to specify more complex formatting rules, such as pluralization and localization.

For example, the following code uses the MessageFormat 

\class to interpolate the values of the name and age variables into the string, and to pluralize the word "year" depending on the value of the age variable:

Java
String name = "John Doe";
int age = 30;
String message = new MessageFormat("Hello, {0}! You are {1,number,integer} years old.")
    .format(new Object[]{name, age});*/
		
		String name = "John Doe";
		int age = 30;
		String message = String.format("Hello, %s! You are " +
		"%d years old.", name, age);
		System.out.println(message);
		
		
		String namey = "John Doe";
		String messagey = String.format("Hello, %s!", namey);
		System.out.println(messagey);

		


	}

}
