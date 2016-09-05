/**
 * This example's original source is 
 * http://www.javaworld.com/article/2946534/learn-java/java-101-the-essential-java-language-features-tour-part-7.html
 */
package java8examples.methodreferences;

import java.util.function.Supplier;

public class MethodReferences2 {

	public static void main(String... args) {
		
		// Bound non-static method reference
		
		String s = "This is a sentence in a string.";
		
		// With anonymous class
		
		print(new Supplier<Integer>() {
			@Override
			public Integer get() {
				return s.length();
			}
		});
		
		// Equivalent with lambda expression
		
		print(() ->  s.length());
		
		// Equivalent with method reference
		
		print(s::length);
	}
	
	public static void print(Supplier<Integer> supplier) {
		System.out.println(supplier.get());
	}
}
