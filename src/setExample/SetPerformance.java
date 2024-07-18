package setExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPerformance {
	
	 public static void main(String[] args) {
	        int n = 1000000;
	        Set<Person> hashSet = new HashSet<>();
	        Set<Person> linkedHashSet = new LinkedHashSet<>();

	        // Measure performance for HashSet
	        long start = System.currentTimeMillis();
	        for (int i = 0; i < n; i++) {
	            hashSet.add(new Person(i, "Person" + i, i % 100));
	        }
	        long end = System.currentTimeMillis();
	        System.out.println("HashSet add: " + (end - start) + "ms");

	        start = System.currentTimeMillis();
	        for (int i = 0; i < n; i++) {
	            hashSet.contains(new Person(i, "Person" + i, i % 100));
	        }
	        end = System.currentTimeMillis();
	        System.out.println("HashSet contains: " + (end - start) + "ms");

	        start = System.currentTimeMillis();
	        for (int i = 0; i < n; i++) {
	            hashSet.remove(new Person(i, "Person" + i, i % 100));
	        }
	        end = System.currentTimeMillis();
	        System.out.println("HashSet remove: " + (end - start) + "ms");

	        // Measure performance for LinkedHashSet
	        start = System.currentTimeMillis();
	        for (int i = 0; i < n; i++) {
	            linkedHashSet.add(new Person(i, "Person" + i, i % 100));
	        }
	        end = System.currentTimeMillis();
	        System.out.println("LinkedHashSet add: " + (end - start) + "ms");

	        start = System.currentTimeMillis();
	        for (int i = 0; i < n; i++) {
	            linkedHashSet.contains(new Person(i, "Person" + i, i % 100));
	        }
	        end = System.currentTimeMillis();
	        System.out.println("LinkedHashSet contains: " + (end - start) + "ms");

	        start = System.currentTimeMillis();
	        for (int i = 0; i < n; i++) {
	            linkedHashSet.remove(new Person(i, "Person" + i, i % 100));
	        }
	        end = System.currentTimeMillis();
	        System.out.println("LinkedHashSet remove: " + (end - start) + "ms");
	    }

}