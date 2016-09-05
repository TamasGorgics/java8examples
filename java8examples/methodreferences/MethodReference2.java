/**
 * This example's original source is 
 * http://www.javaworld.com/article/2946534/learn-java/java-101-the-essential-java-language-features-tour-part-7.html
 */
package java8examples.methodreferences;

import java.util.function.Supplier;

public class MethodReference2 {

	public static void main(String... args) {
		
		// Bound non-static method reference
		
		String s = "This is a sentence in a string.";
		
		// With anonymous class
		
		printFirst(new Supplier<Integer>() {
			@Override
			public Integer get() {
				return s.length();
			}
		});
		
		// Equivalent with lambda expression
		
		printFirst(() ->  s.length());
		
		// Equivalent with method reference
		
		printFirst(s::length);
	}
	
	public static void printFirst(Supplier<Integer> supplier) {
		System.out.println(supplier.get());
	}
}
