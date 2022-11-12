package Assignment2;

import java.util.Arrays;

public class QuickSort {
	int doPartition(int [] arr,int low,int high) {
		int pivot = high;
		int i = low;
		int j = low;
		while(j<pivot) {
			if(arr[pivot] <= arr[j]) {
				j++;
			}else if(arr[pivot] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[pivot];
		arr[pivot] = temp;
		return i;
	}
	
	void QuickSort(int arr[],int low,int high) {
		if(high > low) {
			int pivot = doPartition(arr, low, high);
			QuickSort(arr,low,pivot-1);
			QuickSort(arr, pivot+1, high);
		}
		
	}
}
