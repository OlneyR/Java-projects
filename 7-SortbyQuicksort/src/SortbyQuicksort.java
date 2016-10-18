import java.util.Arrays;
import java.util.Scanner;

public class SortbyQuicksort {
	private static int array[];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Enter the quantity of numbers that you want to sort (by quick sort.)");
			int len = scan.nextInt();
			int[] unsorted = new int[len];
			for (int i=0;i<len;i++){
				System.out.println("Enter #");
				int number = scan.nextInt();
				unsorted[i] = number;
			}
			array = unsorted;
			int first = 0;
			int last = len - 1;
			SortbyQuicksort.quickSort(first, last);
			System.out.println("The final result is:");
			System.out.println(Arrays.toString(array));
		}
	}
	private static void quickSort(int left,int right){
		int i = left;
		int j = right;
		int k = 0;
		int pivot = array[i+(j-i)/2];
		while (i<=j){
			while (array[i]<pivot){
				i++;
			}
			while (array[j]>pivot){
				j--;
			}
			if (i<=j){
				k=array[i];
				array[i]=array[j];
				array[j]=k;
				i++;
				j--;
			}
		}
		if (left < j){
			quickSort(left,j);
		}
		if (i < right){
			quickSort(i,right);
		}
	}
}
