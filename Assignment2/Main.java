package Assignment2;

import java.util.Arrays;

public class Main {
//	1. WAP to find the duplicates present in an array.
	
	public static int findDuplicates() {
		int arr []	= {1,2,3,1,4,65,7,6,5,4,2,1};
		int ans = 0;
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i-1] == arr[i]) {
				ans++;
				while(arr[i-1]==arr[i]) i++;
			}
		}
		return ans;
	}

	public static void main(String ...arg) {
		System.out.println("Number of Dups " + findDuplicates());
		MergeSort sort = new MergeSort();
		int arr []	= {1,2,3,1,4,65,7,6,5,4,2,1};
		sort.mergeSort(arr, 0, arr.length);
		System.out.println("Merge SOrt :- " + Arrays.toString(arr));
		QuickSort p = new QuickSort();
		p.QuickSort(arr, 0, arr.length-1);
		System.out.println("Quick Sort :- " + Arrays.toString(arr));
		BubbleSort bSort = new BubbleSort();
		bSort.sort(arr);
		System.out.println("Bubble Sort " + Arrays.toString(arr));
		int main[] = {1,2,3,4,5,6,7};
		int aux[] = {5,6};
		CheckSubSetOrNot checkSubSetOrNot = new CheckSubSetOrNot();
		System.out.println("Check if Subsets : " + checkSubSetOrNot.checkIfSubset(main, aux));
	}
}
