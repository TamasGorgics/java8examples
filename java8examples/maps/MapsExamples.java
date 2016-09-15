/**
 * Original source: https://github.com/winterbe/java8-tutorial#maps
 */
package java8examples.maps;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {

	public static void main(String... args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		// Putting elements into the map
		
		for (int i = 0; i < 10; i++) {
			map.putIfAbsent(i, "value_" + i);
		}
		
		// Iterating through all the values in map and printing them
		
		map.forEach((key, val) -> System.out.println(key + ". element: " + val));
		
		// Compute code on map
		
		System.out.println(map.computeIfPresent(7, (key, value) -> value + key)); // value_77
		
		map.computeIfPresent(5, (key, value) -> null);
		System.out.println(map.containsKey(5)); // false
		
		System.out.println(map.computeIfAbsent(12, key -> "value_" + key)); // value_12
		System.out.println(map.containsKey(12)); // true
		
		System.out.println(map.computeIfAbsent(3, value -> "value_" + 33)); // value_3 !
		
		// Remove an entry from the map if it is currently mapped to a given value
		
		map.remove(3, "value_33");
		System.out.println(map.containsKey(3)); // true, did not remove, the value was wrong
		map.remove(3, "value_3");
		System.out.println(map.containsKey(3)); // false, it was removed
		
		// Default value if key is not present
		
		System.out.println(map.getOrDefault(6, "key not present")); // value_6
		System.out.println(map.getOrDefault(20, "key not present")); // key not present
		
		// Merging entries
		
		System.out.println(map.merge(8, "_new", (value, newValue) -> value.concat(newValue))); // value_8_new
	}
}
