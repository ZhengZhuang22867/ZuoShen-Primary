package sort;

import java.util.Arrays;

public class merge {

	public static void mergeSort(int[] arr) {
		if(arr == null || arr.length < 2) {
			return;
		}
		mergeSortHelper(arr, 0, arr.length-1);
	}
	
	public static void mergeSortHelper(int[] arr,  int L, int R) {
		if(L >= R) return;
		//int mid = (L + R) / 2;
		int mid = L + ((R - L) >> 1);
		mergeSortHelper(arr, L, mid);
		mergeSortHelper(arr, mid+1, R);
		merge(arr, L, mid, R);
	}
	
	public static void merge(int[] arr, int L, int mid, int R) {
		int p = L;
		int p1 = mid+1;
		int index = 0;
		int[] arrHelper = new int[R-L+1];
		while(p <= mid && p1 <= R) {
			arrHelper[index++] = arr[p] <= arr[p1] ? arr[p++] : arr[p1++]; 
		}
		while(p <= mid) {
			arrHelper[index++] = arr[p++];
		}
		while(p1 <= R) {
			arrHelper[index++] = arr[p1++];
		}
		for(index=0; index < arrHelper.length; index++) {
			arr[L+index] = arrHelper[index];
		}
	}
	
	public static void main(String[] args) {
		int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
				
		mergeSort(array);
		
		System.out.println(Arrays.toString(array));

	}

}
