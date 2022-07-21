package sort;

import java.util.Arrays;

public class selection {
	
	public static void selectionSort(int[] arr) {
		if(arr == null || arr.length < 2) return;
		
		for(int i=0; i<arr.length; ++i) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; ++j) {
				minIndex = arr[minIndex] > arr[j] ? j : minIndex;
			}
			swap(arr, minIndex, i);
		}
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void main(String[] args) {
		int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
				
		selectionSort(array);
		
		System.out.println(Arrays.toString(array));

	}

}
