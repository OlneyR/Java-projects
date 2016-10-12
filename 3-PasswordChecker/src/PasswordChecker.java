import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Enter a password: (at least 8 characters, requires minimum 1 number, capital, and lower case) ");
			String n = scan.nextLine();
			String verdict = checkPass(n);
			System.out.println(verdict);
		}
	}
	
	public static String checkPass(String o) {
		String x="Password meets requirements.";
		boolean z=true;
		if (o.length()<8){
			x="Password is not long enough. ";
			z=false;
		}
		if (o==o.toLowerCase()){
			if (z==false){
				x+="Password does not have any capital letters.";
			}
			else {
				x="Password does not have any capital letters. ";
				z=false;
			}
		}
		if (o==o.toUpperCase()){
			if (z==false){
				x+="Password does not have any lowercase letters.";
			}
			else {
				x="Password does not have any lowercase letters. ";
				z=false;
			}
		}
		if (!o.matches(".*\\d.*")){
			if (z==false){
				x+="Password does not have any numbers.";
			}
			else {
				x="Password does not have any numbers.";
			}
		}
		return x;
	}
	

}
