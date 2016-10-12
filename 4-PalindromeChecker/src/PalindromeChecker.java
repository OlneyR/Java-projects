import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Enter a word or phrase to check if it is a palindrome:");
			String n = scan.nextLine();
			String result = checkPalindrome(n);
			System.out.println(result);
		}
	}

	public static String checkPalindrome(String x) {
		x=x.toLowerCase();
		String trimmedX = x.replaceAll("\\W","");
		String reverseX = new StringBuilder(trimmedX).reverse().toString();
		int length= trimmedX.length();
		String z = "It is a palindrome.";
		for (int i=0;i<length;i++){
			if (trimmedX.charAt(i)!=reverseX.charAt(i)) {
				z = "It is not a palindrome.";
				return z;
			}

		}
		return z;
	}
	
}
