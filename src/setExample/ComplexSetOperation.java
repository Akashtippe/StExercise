package setExample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ComplexSetOperation {
	//public static void List<Person>
	 public static Set<Person> filterByAge(Set<Person> set, int age) {
	        Set<Person> result = new HashSet<>();
	        for (Person p : set) {
	            if (p.getAge() > age) {
	                result.add(p);
	            }
	        }
	        return result;
	    }
	

	public static void main(String[] args) {
		Set<Person>hashset=new HashSet<>();
		
		hashset.add(new Person(1, "Rima", 26));
		hashset.add(new Person(2, "Shivani", 25));
		hashset.add(new Person(3, "Ketaki", 28));
		hashset.add(new Person(4, "Darshika", 27));
		hashset.add(new Person(5, "Shobha", 50));
		hashset.add(new Person(6, "Archana", 37));
		
		Comparator<Person> comparator=Comparator.comparing(Person::getAge);
		//get min or max
		Person minAge=hashset.stream().min(comparator).get();
		Person maxAge=hashset.stream().max(comparator).get();
		System.out.println("Minimum age:"+minAge);
		System.out.println("Maximum age:"+maxAge);
		
//	//Sorting by
	List<Person>list=new ArrayList<Person>(hashset);
	list.sort(Comparator.comparingInt(Person::getAge));
	System.out.println("sorted by age:"+list);

	 Set<Person> ageFilteredSet = filterByAge(hashset, 28);
     System.out.println("Persons with age > 28: " + ageFilteredSet);
 }
	

}
