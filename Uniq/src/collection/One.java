package collection;

import java.util.ArrayList;
import java.util.Collections;

public class One implements Comparable<One> {
	Integer id;
	String name;
	String job;
	Integer salary;

	One(Integer id, String name, String job, Integer salary) {
		this.id = id;
		this.name = name;
		this.job = job;
		this.salary = salary;

	}

	@Override
	public int compareTo(One o) {
		// One a=(One)o;
		Integer b = o.name.compareTo(name);
		if (b < 1)
			return 1;
		else if (b > 1)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + job + " " + salary;
	}

	public static void main(String[] args) {

		ArrayList al = new ArrayList<>();
		al.add(new One(2, "Nandhini", "developer", 200000));
		al.add(new One(1, "Dilli babu", "developer", 100000));
		al.add(new One(4, "Santhosh", "developer", 300000));
		Collections.sort(al);
		System.out.println(al);
	}

}