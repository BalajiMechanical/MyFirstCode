package task;

interface Employee {
	int add(int a, int b);
}

class EmployeeDetails {

	String name;
	double salary;
	String job;
	int experience;

	public EmployeeDetails(String name, double salary, String job, int experience) {
		this.name = name;
		this.salary = salary;
		this.job = job;
		this.experience = experience;
	}

	public double getIncrementedSalary(Employee addExperience) {
		if (job.equalsIgnoreCase("developer") && experience >= 3) {
			return salary + addExperience.add(5000, experience);
		} else {
			return salary;
		}
	}
}

public class EmployeeTask {

	public static void main(String[] args) {

		// Creating an instance of the EmployeeDetails
		EmployeeDetails employee = new EmployeeDetails("John", 50000, "developer", 3);
		EmployeeDetails employee1 = new EmployeeDetails("Balaji", 50000, "developer", 2);
		EmployeeDetails employee2 = new EmployeeDetails("Vicky", 50000, "Tester", 3);
		EmployeeDetails employee3 = new EmployeeDetails("Bharath", 50000, "Tester", 4);
		EmployeeDetails employee4 = new EmployeeDetails("JohnWick", 50000, "developer", 4);

		// Using lambda expression to implement the functional interface
		Employee addExperience = (a, b) -> a * b;

		// Getting the incremented salary
		double incrementedSalary = employee.getIncrementedSalary(addExperience);

		// Printing the incremented salary
		System.out.println("Incremented Salary: " + incrementedSalary);
	}

}
