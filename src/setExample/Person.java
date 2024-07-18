package setExample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Person {
	private int id;
	private String name;
	private int age;
	
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		//if both the object references are referring to the same object
		if(this == obj)
            return true;
//It checks if the argument is of the type Person comparing the classes of the
//passed argument and this object
//if(!(obj instanceof Person)) return false
		if(obj== null || obj.getClass()!=this.getClass())
			return false;
//type casting of the argument
		Person person=(Person) obj;
//comparing the state of argument with this state of 'this' object
		return(person.id== this.id);	
	}
	@Override
	public int hashCode() {
//We are returning the Person_id as a hashcode value & also can return some calculated value
		return this.id;
		
	}
	public static void addPerson(Set<Person> set,Person person) {
		set.add(person);
	}
	public static void main(String[] args) {
		Set<Person>hashset=new HashSet<>();
		Set<Person>linkedHashSet=new LinkedHashSet<>();
		Person p1=new Person(1, "Rima", 27);
		Person p2=new Person(2, "Shivani", 25);
		Person p3=new Person(3, "Punam", 28);
		Person p4=new Person(3, "Punam", 28);
		
		addPerson(hashset,p1);
		addPerson(hashset,p2);
		addPerson(hashset,p3);
		addPerson(hashset,p4);
		
		addPerson(linkedHashSet,p1);
		addPerson(linkedHashSet,p2);
		addPerson(linkedHashSet,p3);
		addPerson(linkedHashSet,p4);
		
		System.out.println("HashSet: "+hashset);
		System.out.println("LinkedHashSet: "+linkedHashSet);
	}
	

}
