import java.util.ArrayList;
import java.util.Collections;

public class Department {
//the project was not to determine names, so a simple list is better than assignment based on age/dept
	public String[] employeeList() {
		String[] names = {"Counting Guru","Counting Pro","Counting Savvy","Counting Novice","Sales Guru","Sales Pro","Sales Savvy","Hiring Guru","Hiring Pro","Hacking Pro","Hacking Guru","Hacking Savvy","Hacking Novice"};
		return names;
	}
//there is no instruction on placement for the list of people's age, near name list seems to be a good location.
	public Integer[] ageList() {
		Integer[] ages = {55,45,40,25,50,48,38,58,47,46,51,38,23};
		return ages;
	}
//and department relations list
	public int[] deptList() {
		int[] depts = {0,0,0,0,1,1,1,2,2,3,3,3,3};
		return depts;
	}
	
//department age sort
//	
	public static ArrayList<Integer> ageSort(int a, int b, ArrayList<Integer> c){
		Collections.sort(c.subList(a,b));
		return c;
	}
	
//department information return

	public static String departmentName(int deptNumber) {
		new Company();
		String[] dNames = Company.deptNames();
		String dName = dNames[deptNumber];
		return dName;
	}
}
