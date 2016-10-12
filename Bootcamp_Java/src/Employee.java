
public class Employee {
	public int age;
	public String name;
	public String department;
	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}//not including department in this because list is ordered by department, so it's values in company main will not change
}
