import java.util.Arrays;
import java.util.Scanner;
//not making this too easy on myself, not going to sort a pre-determined array
public class SortbyInsertion {

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
			int[] sorted = insertSort(unsorted);
			System.out.println("The final result is:");
			System.out.println(Arrays.toString(sorted));
		}
	}
	public static int[] insertSort(int[] unsorted){
		int len = unsorted.length;
		int k=0;
		for (int i=1;i<len;i++){
			int j = i;
			while (j > 0 && unsorted[j]<unsorted[j-1]){
				k = unsorted[j-1];
				unsorted[j-1] = unsorted[j];
				unsorted[j] = k;
				j--;//last thing to get this working, this
			}
			//System.out.println(Arrays.toString(unsorted));//to display incremental progress
		}
		return unsorted;//finished sorting
	}
}


