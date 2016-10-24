import java.util.Arrays;
import java.util.Scanner;

public class SortbyMergesort {
	private int array[];
	private int workArray[];
	private int length;
	public static void main(String[] args) {
		
		try(Scanner scan=new Scanner(System.in)){
			int len = scan.nextInt();
			int[] unsorted = new int[len];
			for (int i=0;i<len;i++){
				System.out.println("Enter #");
				int number = scan.nextInt();
				unsorted[i] = number;
			}
			SortbyMergesort merge = new SortbyMergesort();
			merge.sort(unsorted);
			System.out.println("The final result is:");
			System.out.println(Arrays.toString(unsorted));
		}

	}
	private void sort(int[] unsorted){
		this.array = unsorted;
		this.length = unsorted.length;
		this.workArray = new int[length];
		mergeSort(0, length-1);
	}
	private void mergeSort(int low,int high){
		if(low<high){
			int middle = low + (high - low) / 2;
			mergeSort(low,middle);
			mergeSort(middle+1,high);
			mergeParts(low,middle,high);
		}
	}
	private void mergeParts(int low,int mid, int high){
		for(int i=low;i<=high;i++){
			workArray[i] = array[i];
		}
		int i = low;
		int j = mid + 1;
		int k = low;
		while(i<=mid && j<=high){
			if(workArray[i]<=workArray[j]){
				array[k]=workArray[i];
				i++;
			}else{
				array[k]=workArray[j];
				j++;
			}
			k++;
		}
		while(i<=mid){
			array[k] = workArray[i];
			k++;
			i++;
		}
	}
	
}
