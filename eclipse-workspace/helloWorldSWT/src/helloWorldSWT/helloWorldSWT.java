package helloWorldSWT;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class helloWorldSWT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Hello world!");
		shell.open();
	    System.out.println("Hello! \n" + "  \t \t \t  world!    THe angels are here to save us and keep me strong !   ");
	      
		while (!shell.isDisposed()) {
		if (!display.readAndDispatch()) display.sleep();
		}
		display.dispose();
      
	}
		

}
