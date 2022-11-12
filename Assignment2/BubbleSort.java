package Assignment2;

public class BubbleSort {
	static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		int size = arr.length;
		for(int i=0;i<size;i++) {
			for(int j = 0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
		
	}

}
