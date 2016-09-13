package java8examples.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsExample {
	
	public static void main(String... args) {
		
		List<String>  strings = Arrays.asList("abc", "ade", "cde", "", "xyz", "zzy", "", "zzz");
		
		// Intermediate operations
		
		// Filter example: print the non-empty strings
		
		strings.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList()).forEach(System.out::println);
		
		// Map example: print strings without 'a' letters
		
		strings.stream().map(s -> s.replace("a", "")).collect(Collectors.toList()).forEach(System.out::println);
		
		// Sorted example: strings in order
		
		strings.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		// Terminal operations
		
		// Match example: returns boolean if any/all/none matching element was found
		
		System.out.println(strings.stream().anyMatch(s -> s.contains("c")));  // should return true
		
		System.out.println(strings.stream().allMatch(s -> s.contains("c")));  // should return false
		
		System.out.println(strings.stream().noneMatch(s -> s.contains("q")));  // should return true
		
		// Count example: returns the number of elements as a long starting with 'a'
		
		System.out.println(strings.stream().filter(s -> s.startsWith("a")).count());
		
		// Reduce example: returns the content of the list in an optional string
		
		Optional<String> reducedString = strings.stream().filter(s -> !s.isEmpty()).sorted().reduce((s1, s2) -> s1 + "." + s2);
		reducedString.ifPresent(System.out::println);
	}
}
