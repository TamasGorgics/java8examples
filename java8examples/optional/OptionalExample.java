package java8examples.optional;

import java.util.Optional;

/**
 * @author Tamás Görgics
 */
public class OptionalExample {

	public static void main(String... args) {
	
		Optional<String> optional1 = Optional.of("This is a string.");
		Optional<String> optional2 = Optional.ofNullable(null);
		
		System.out.println(optional1.isPresent()); // Should be true
		System.out.println(optional2.isPresent()); // Should be false
		System.out.println(optional1.orElse("Other string.")); // Should be "This is a string."
		System.out.println(optional2.orElse("Other string.")); // Should be "Other string."
		
		optional1.ifPresent(s -> System.out.println(s)); // Should print "This is a string."
		optional2.ifPresent(s -> System.out.println(s)); // Should not print anything
	}
}
