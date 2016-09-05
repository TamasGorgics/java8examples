package java8examples.methodreferences;

import java.util.Arrays;
import java.util.function.Consumer;

public class MethodReferences1 {

	public static void main(String... args) {
		
		// Static method reference: className::staticMethodName
		
		int[] numbers = {3, 7, 1, 4, 9};
		
		// Using a functional interface - Consumer
		
		Consumer<int[]> consumer = Arrays::sort; 
		consumer.accept(numbers);
		
		// Printing out the array to check sorting
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
		System.out.println();
		
		// Equivalent with lambda expression
		
		int[] numbers2 = {10, 3, 7, 8, 2};
		Consumer<int[]> consumer2 = a -> Arrays.sort(a);
		consumer2.accept(numbers2);
		
		for (int i : numbers2) {
			System.out.println(i);
		}
		
	}
}
