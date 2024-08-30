
public class HelloWorld
{ // start class
	
	// private string to be used within class, think self._variable
	private String greeting = "Hello, World!";
	
	// creating the greet() function
	public void greet() 
	{ // start function
		System.out.println(greeting);
	} // end function
	
	public static void main(String[] args) 
	{ // start main()
		// prefix HelloWorld makes "helloWorld" a local variable, 
		// new HelloWorld() creates the object
		HelloWorld helloWorld = new HelloWorld();
		// calling greet function
		helloWorld.greet();
	} // end main()

} // end class
