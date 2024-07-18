package setExample;

import java.util.HashSet;
import java.util.Set;

public class SetConference {
	
	
	 private Set<Person> attendees;

	    public SetConference() {
	        this.attendees = new HashSet<>();
	    }

	    public void addAttendee(Person person) {
	        attendees.add(person);
	    }

	    public void removeAttendee(Person person) {
	        attendees.remove(person);
	    }

	    public Set<Person> findDuplicateAttendees() {
	        Set<Person> duplicates = new HashSet<>();
	        Set<Integer> ids = new HashSet<>();
	        for (Person person : attendees) {
	            if (!ids.add(person.getId())) {
	                duplicates.add(person);
	            }
	        }
	        return duplicates;
	    }

	    public Set<Person> listUniqueAttendees() {
	        return new HashSet<>(attendees);
	    }

	    public Set<Person> findAttendeesInRange(int minAge, int maxAge) {
	        Set<Person> result = new HashSet<>();
	        for (Person person : attendees) {
	            if (person.getAge() >= minAge && person.getAge() <= maxAge) {
	                result.add(person);
	            }
	        }
	        return result;
	    }

	    @Override
	    public String toString() {
	        return "Conference{attendees=" + attendees + '}';
	    }

	    public static void main(String[] args) {
	        SetConference conference = new SetConference();
	        conference.addAttendee(new Person(1, "Punam", 30));
	        conference.addAttendee(new Person(2, "Rima", 25));
	        conference.addAttendee(new Person(3, "Darshika", 27));
	        conference.addAttendee(new Person(1, "Punam", 30)); // Duplicate

	        System.out.println("Conference Attendees: " + conference);

	        Set<Person> duplicates = conference.findDuplicateAttendees();
	        System.out.println("Duplicate Attendees: " + duplicates);

	        Set<Person> uniqueAttendees = conference.listUniqueAttendees();
	        System.out.println("Unique Attendees: " + uniqueAttendees);

	        Set<Person> ageRangeAttendees = conference.findAttendeesInRange(25, 30);
	        System.out.println("Attendees with age between 25 and 30: " + ageRangeAttendees);
	    }
	
	

}