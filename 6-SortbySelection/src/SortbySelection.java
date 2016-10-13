import java.util.Arrays;
import java.util.Scanner;

public class SortbySelection {

	public static void main(String[] args) {

		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Enter the quantity of numbers that you want to sort (by selection.)");
			int len = scan.nextInt();
			int[] unsorted = new int[len];
			for (int i=0;i<len;i++){
				System.out.println("Enter #");
				int number = scan.nextInt();
				unsorted[i] = number;
			}
			int[] sorted = insertSort(unsorted);
			System.out.println("The final result is:");
			System.out.println(Arrays.toString(sorted));
		}
	}
	
	public static int[] insertSort(int[] unsorted){
		int len = unsorted.length;
		int k=0;//swap placeholder
		for (int i=0;i<len;i++){
			int nextLowest = i;
			for (int j=i+1;j<len;j++){
				if (unsorted[j]<unsorted[nextLowest]){//then the next number is lowest on that loop
					nextLowest = j;
				}
			}//internal loop has lowest # of the remaining #s
			if (nextLowest!=i){
				k = unsorted[i];
				unsorted[i] = unsorted[nextLowest];
				unsorted[nextLowest] = k;
			}
			
			System.out.println(Arrays.toString(unsorted));//to display incremental progress
		}
		return unsorted;//finished sorting
	}
}
