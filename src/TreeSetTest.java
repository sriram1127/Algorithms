import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		TreeSet<Employee> ts = new TreeSet(new EmployeeCom());

		Employee employee1 = new Employee();
		employee1.name = "A";
		employee1.salary = 12;

		Employee employee2 = new Employee();
		employee2.name = "B";
		employee2.salary = 10;

		Employee employee3 = new Employee();
		employee3.name = "B";
		employee3.salary = 13;

		ts.add(employee1);
		ts.add(employee2);
		ts.add(employee3);

		System.out.println(ts);

	}

}

class EmployeeCom implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		// return e1.name.compareTo(e2.name);
		if (e1.salary > e2.salary)
			return 1;
		else if (e1.salary < e2.salary)
			return -1;
		else
			return 0;
	}
}

class Employee {
	String name;
	int salary;

	/*
	 * class Employee implements Comparable { String name; int salary;
	 * 
	 * @Override public int compareTo(Object o) {
	 * 
	 * return this.name.compareTo(((Employee) o).name); }
	 */

}