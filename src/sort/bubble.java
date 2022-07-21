package sort;

import java.util.Arrays;

/**
 * √∞≈›≈≈–Ú
 * @author 15250
 *
 */
public class bubble {
	
	public static void bubbleSort(int[] arr) {
		if(arr == null || arr.length < 2) return;
		
		int L = arr.length;
		
		for(int i=0; i<L; ++i) {
			for(int j=0; j<L-1-i; ++j) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	public static void swap(int[] arr, int L, int R) {
		int temp = arr[L];
		arr[L] = arr[R];
		arr[R] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
		
	    bubbleSort(array);

	    System.out.println(Arrays.toString(array));
	}

}
