import java.util.Arrays;
import java.util.Scanner;

public class SortbyQuicksort {

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
			int first = 0;
			int last = len - 1;
			unsorted = pivotMove(unsorted);
			int[] sorted = quickSort(unsorted,first,last);
			System.out.println("The final result is:");
			System.out.println(Arrays.toString(sorted));
		}
	}
	
	public static int[] pivotMove(int[] original){//pick number from center of source array and move to pivot, so that if it is already sorted, will not degrade to least efficiency
		int len = original.length;
		int x = original[0];
		original[0] = original[len/2];
		original[len/2] = x;
		return original;
	}
	
	public static int[] quickSort(int[] unsorted, int first, int last){
		int length = unsorted.length;
		int left=first+1;
		int right=last;
		int k = 0;
		int pivot = first;
		int[] blank = new int[length-1];
		while(left<right){
			if(unsorted[left]<unsorted[pivot])left++;
			if(unsorted[right]>unsorted[pivot])right--;
			if(unsorted[left]>unsorted[pivot]&&unsorted[right]<unsorted[pivot]){
				k=unsorted[left];
				unsorted[left]=unsorted[right];
				unsorted[right]=k;
			}
		}
		if(right<=left){
			k=unsorted[pivot];
			unsorted[pivot]=unsorted[right];
			unsorted[right]=k;
		}
		if (length>3){
			int Llen= right+1;
			if (Llen>1){
				int[] Larr=new int[Llen];
				for(int j=0;j<Llen;j++){
					Larr[j]=unsorted[j];
				}
				Larr = pivotMove(Larr);
				Larr = quickSort(Larr,0,Llen-1);
				for(int j=0;j<Llen;j++){
					blank[j]=Larr[j];
				}
			}
			int Rlen= last-right;
			if (Rlen>1){
				int[] Rarr=new int[Rlen];
				for(int l=right+1;l<Rlen;l++){
					Rarr[l]=unsorted[l];
				}
				Rarr = pivotMove(Rarr);
				Rarr = quickSort(Rarr,0,Rlen-1);
				for(int s=right+1;s<last;s++){
					blank[s]=Rarr[s];
				}
			}
		}
	return blank;
	}
}
