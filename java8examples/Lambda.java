package java8examples;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda {

	public static void main(String... args) {
		
		List<String> names = new ArrayList<>();
		names.add("Anne");
		names.add("Dave");
		names.add("Bob");
		names.add("Claire");
		
		// In previous java versions sorting looked like this with anonymous inner class:
		
		names.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareTo(s1);
			}
		});
		
		// In java 8 the same can be expressed with a lambda expression:
		
		names.sort((String s1, String s2) -> {
			return s2.compareTo(s1);
		});
		
		// For one-line method bodies we can skip the return keyword and braces:
		
		names.sort((String s1, String s2) -> s2.compareTo(s1));
		
		// But it can be even shorter:
		
		names.sort((s1, s2) -> s2.compareTo(s1));
		
		// Notice how a 6 lines long call become a one-liner. 
		// Powerful, isn't it? :)
		
		// Check if the names list is really sorted (in reverse order):
		
		names.forEach(System.out::println);
	}
}
