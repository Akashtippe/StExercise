package setExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperation {
	public static void performUnion(Set<Person>hashset,Set<Person>linkedHashSet) {
		Set<Person>union=new HashSet<>(hashset);
		union.addAll(linkedHashSet);
		System.out.println("union :"+union);
	}
	public static void performIntersection(Set<Person>hashset,Set<Person>linkedHashSet) {
		Set<Person>Intersection=new HashSet<>(hashset);
		Intersection.retainAll(linkedHashSet);
		System.out.println("Intersection :"+Intersection);
	}
	public static void performDifference(Set<Person>hashset,Set<Person>linkedHashSet) {
		Set<Person>difference1=new HashSet<>(hashset);
		difference1.removeAll(linkedHashSet);
		System.out.println("difference1 :"+difference1);
		
		Set<Person>difference2=new HashSet<>(linkedHashSet);
		difference2.removeAll(hashset);
		System.out.println("difference2 :"+difference2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person>hashset=new HashSet<>();
		Set<Person>linkedHashSet=new LinkedHashSet<>();
		
		hashset.add(new Person(1, "Rima", 27));
		hashset.add(new Person(2, "Shivani", 25));
		hashset.add(new Person(3, "Ketaki", 28));
		hashset.add(new Person(4, "Darshika", 27));
		
		linkedHashSet.add(new Person(4, "Darshika", 27));
		linkedHashSet.add(new Person(6, "Priyanka", 25));
		linkedHashSet.add(new Person(3, "Ketaki", 28));
		linkedHashSet.add(new Person(8, "Manali", 28));
		
		System.out.println("hashset: "+hashset);
		System.out.println("linkedHashSet: "+linkedHashSet);
		
		
		
		performUnion(hashset, linkedHashSet);
		performIntersection(hashset, linkedHashSet);
		performDifference(hashset, linkedHashSet);
	}
		

	}


