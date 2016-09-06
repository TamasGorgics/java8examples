package java8examples.defaultmethod;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Tamás Görgics
 *
 */
public class DefaultMethod {

	public static void main(String... args) {
		
		MyClassA a = new MyClassA();
		MyClassB b = new MyClassB();
		
		a.myAbstractMethod();
		b.myAbstractMethod();
		
		// These two should print the same sentence
		
		a.myDefaultMethod();
		b.myDefaultMethod();
	}
}

interface MyInterface {

	default void myDefaultMethod() {
		System.out.println("Default method invoked from parent class.");
	}
	
	void myAbstractMethod();
}

class MyClassA implements MyInterface {

	@Override
	public void myAbstractMethod() {
		System.out.println("myAbstractMethod invoked from myClassA");
	}	
}

class MyClassB implements MyInterface {
	
	@Override
	public void myAbstractMethod() {
		System.out.println("myAbstractMethod invoked from myClassB");
	}
}
