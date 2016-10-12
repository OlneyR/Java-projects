import java.util.Scanner;

public class HexPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Enter an integer: ");
			int n = scan.nextInt();
			System.out.println(Integer.toHexString(n));
		}
	}
}
