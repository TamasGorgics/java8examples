package java8examples.defaultmethod;

/**
 * @author Tamás Görgics
 *
 */
public class DefaultMethod2 {
	
	public static void main(String... args) {
		
		MyClasss myClass = new MyClasss();
		
		myClass.print(); // Should print 3 lines.
	}
}

interface MyInterface1 {
	default void print() {
		System.out.println("Printed from MyInterface1.");
	}
}

interface MyInterface2 {
	default void print() {
		System.out.println("Printed from MyInterface2.");
	}
}

class MyClasss implements MyInterface1, MyInterface2 {
	
	// This class MUST override the print() method, because both interfaces
	// declare it so it is not obvious which one's should run when invoked.
	
	@Override
	public void print() {
		
		// We can invoke the interfaces' default methods with this syntax:
		
		MyInterface1.super.print();
		MyInterface2.super.print();
		
		System.out.println("Printed from MyClasss.");
	}
}