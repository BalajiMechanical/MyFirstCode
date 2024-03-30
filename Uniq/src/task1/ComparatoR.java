package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import collection.Arraylist;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

class AgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {
		int comparTo = p1.getName().compareTo(p2.getName());
		if (comparTo == 0) {
			return 0;
		} else if (comparTo < 0) {
			return -1;
		} else {
			return 1;
		}

//	@Override
//	public int compare(Person p1, Person p2) {
//		
//  		return Integer.compare(p1.getAge(), p2.getAge());
//	}

	}
}

public class ComparatoR {

	public static void main(String[] args) {

		List<Person> people = new ArrayList<>();

		people.add(new Person("Balaji", 23));
		people.add(new Person("Bharath", 22));
		people.add(new Person("Ram", 25));
		people.add(new Person("Thulasi", 31));
		people.add(new Person("Vinoth", 26));
		people.add(new Person("Prakash", 29));
		people.add(new Person("Akash", 24));

		Collections.sort(people, new AgeComparator());

		System.out.println("People After Sorting :");
		Iterator<Person> itr = people.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		for (Person per : people) {
//			System.out.println(per);
//		}
	}

}
