package sort;

import java.util.Arrays;

public class insertion {
	
	public static void insertionSort(int[] arr) {
		if(arr == null || arr.length < 2) return;
		
		for(int i=0; i<arr.length; ++i) {
			int cur = arr[i];
			int j=i-1;
			while(j>=0 && cur < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = cur;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
				
		insertionSort(array);
		
		System.out.println(Arrays.toString(array));

	}

}
