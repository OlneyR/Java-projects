import java.util.Arrays;
import java.util.Scanner;

public class SortbyQuicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Enter the quantity of numbers that you want to sort (by insertion.)");
			int len = scan.nextInt();
			int[] unsorted = new int[len];
			for (int i=0;i<len;i++){
				System.out.println("Enter #");
				int number = scan.nextInt();
				unsorted[i] = number;
			}
			int[] sorted = quickSort(unsorted);
			System.out.println("The final result is:");
			System.out.println(Arrays.toString(sorted));
		}
	}
	public static int[] quickSort(int[] unsorted){
		int len = unsorted.length;
		int pivot = 0;
		if (len % 2 == 0){
			pivot = len / 2;
		}else{
			pivot = (len - 1) / 2;
		}
		for (int i=0;i<len;i++){
			
		}
	}
}
//if value > pvalue & i 