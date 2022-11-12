package Assignment2;

public class MergeSort {
	public void merge(int [] arr,int s,int e,int mid) {
		int i = s;
		int j = mid;
		int k = 0;
		int complimentary [] = new int [e-s];
		while(i<mid && j<e) {
			if(arr[i] < arr[j]) {
				complimentary[k++] = arr[i++];
			}else {
				complimentary[k++] = arr[j++];
			}
		}
		
		while(i<mid) {
			complimentary[k++] = arr[i++];
		}
		
		while(j<e){
			complimentary[k++] = arr[j++];
		}
		
		for(int x=0;x<complimentary.length;x++) {
			arr[x+s] = complimentary[x];
		}
	}
	
	public void mergeSort(int [] arr,int s,int e) {
			if(e-s<=1) return;
			int mid = s + (e-s)/2;
			mergeSort(arr,s,mid);
			mergeSort(arr,mid,e);
			merge(arr,s,e,mid);
	}
}
	
