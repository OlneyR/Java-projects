import java.util.ArrayList;
import java.util.Arrays;


public class Company {
	
	public static String[] deptNames() {
		String[] depts = {"Accounting","Marketing","Human Resources","Information Systems"};
		return depts;
	}
	
	public static void main(String[] args) {
		String[] employeeList = new Department().employeeList();
		Integer[] ageListarr = new Department().ageList();
		ArrayList<Integer> ageList = new ArrayList<Integer>(Arrays.asList(ageListarr));
		int[] deptLister = new Department().deptList();
		boolean[] primeList = {false,false,false,false,false,false,false,false,false,false,false,false,false};//to alter from results
		int employeeCount = employeeList.length;
		for (int i = 0;i<deptNames().length;i++) {
			int lowbound = employeeCount;
			int highbound = 0;//setting up low and high bounds for each department, as long as employee list is sorted by department this will work
			for (int j = 0;j<employeeCount;j++) {
				if (deptLister[j] == i) {
					if (j < lowbound) {
						lowbound = j;
					}
					highbound = j;//keeps setting highbound as highest loop position
				}
				
			}
			if (i == 0 || i == 3) {
				new Department();
				if (lowbound < highbound) {ageList=Department.ageSort(lowbound, highbound+1, ageList);}//if should be always ... +1 as final correction
			}
			
		}//by here: age list is sorted in accounting and information systems
		ArrayList<Integer> ageListOrig = new ArrayList<Integer>(Arrays.asList(ageListarr));
		ArrayList<Employee> employeeInfo = new ArrayList<Employee>();//oh i finally get why i have use for employee.java, arraylist constructor
		for (int g = 0;g<ageList.size();g++) {
			if(ageListOrig.get(g) == ageList.get(g)) {employeeInfo.add(new Employee(ageList.get(g),employeeList[g]));}
			else {
				int ageindex = g;
				ageindex = ageListOrig.indexOf(ageList.get(g));//juggle sorted index locations for proper employee names
				employeeInfo.add(new Employee(ageList.get(g),employeeList[ageindex]));
			}
		}//employeeInfo arraylist now holds properly organized ages and names, deptList holds their associated departments
		
		for (int k = 0;k < employeeCount;k++) {
			boolean primecheck = false;
			new PrimeAgeChecker();
			primecheck = PrimeAgeChecker.isPrime(employeeInfo.get(k).age);
			if (primecheck == true) {primeList[k] = true;}
		}//and now primeList reflects if they are prime
		
		//to print: departmentNames[deptList[z]], employeeInfo.get(z).name, employeeInfo.get(z).age, primeList[z]
		String[] departmentNames = deptNames();
		System.out.println("Department		Name			Age		Prime");
		System.out.println("---------------------------------------------------------------------");
		for (int z=0;z<employeeCount;z++) {
			System.out.printf(departmentNames[deptLister[z]]);
			if (deptLister[z]!=3){System.out.printf("\t\t");}
			else {System.out.printf("\t");}//formatting solved
			System.out.printf(employeeInfo.get(z).name);
			System.out.printf("\t\t");
			System.out.print(employeeInfo.get(z).age);
			System.out.printf("\t\t");
			System.out.println(primeList[z]);
		}
		
		
	}
	
	
}