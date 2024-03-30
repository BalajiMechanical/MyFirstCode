package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparablE implements Comparable {
	String name;
	Integer id, salary;

	ComparablE(String name, Integer id, Integer salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public int compareTo(Object o) {
		ComparablE a = (ComparablE) o;
		Integer b = a.id.compareTo(id);
		if (b == 0)
			return 0;
		else if (b < 0)
			return 1;
		else
			return -1;
	}

	public String toString() {
		return name + " " + id + " " + salary;
	}

	public static void main(String[] args) {
		List al = new ArrayList<>();
		
		al.add(new ComparablE("Balaji", 1, 50000));
		al.add(new ComparablE("Akash", 3, 20000));
		al.add(new ComparablE("vinoth", 2, 40000));
		
		Collections.sort(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//System.out.println(al);
	}

}