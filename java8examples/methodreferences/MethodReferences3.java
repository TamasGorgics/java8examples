/**
 * This example's original source is 
 * http://www.javaworld.com/article/2946534/learn-java/java-101-the-essential-java-language-features-tour-part-7.html
 */
package java8examples.methodreferences;

import java.util.function.Function;

import javax.print.DocFlavor.STRING;

public class MethodReferences3 {

	public static void main(String... args) {
		
		// Unbound non-static method reference
		
		String string = "THIS IS A STRING WITH CAPITAL LETTERS.";
		
		// With anonymous inner class
		
		print(new Function<String, String>() {
			@Override
			public String apply(String s) {
				return s.toLowerCase();
			}
		}, string);
		
		// With lambda expression
		
		print(s -> s.toLowerCase(), string);
		
		// With method reference
		
		print(String::toLowerCase, string);
	}
	
	public static void print(Function<String, String> function, String s) {
		
		System.out.println(function.apply(s));
	}
}
