package task;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTask1 {

	String name;
	double Salary;
	String dept;
	int exp;

	EmployeeTask1(String name, double Salary, String dept, int exp) {
		this.name = name;
		this.Salary = Salary;
		this.dept = dept;
		this.exp = exp;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		this.Salary = salary;
	}

	public String toString() {
		return name + " " + Salary;
	}

//		public class EmployeeStreamExample {

	public static void main(String[] args) {
		List<EmployeeTask1> employees = new ArrayList<>();
		employees.add(new EmployeeTask1("John", 50000, "Developer", 4));
		employees.add(new EmployeeTask1("Jane", 60000, "Manager", 5));
		employees.add(new EmployeeTask1("Bob", 45000, "Tester", 2));

		System.out.println("Before Salary Increment:");
		employees.forEach(System.out::println);

		// Increase salary by 10% for employees with more than 3 years of experience
		incrementSalary(employees);

		System.out.println("\nAfter Salary Increment:");
		employees.forEach(System.out::println);
	}

	private static void incrementSalary(List<EmployeeTask1> employees) {
		employees.parallelStream().filter(emp -> emp.exp > 3).forEach(emp -> emp.setSalary(emp.getSalary() + 5000.0));
	}

}
