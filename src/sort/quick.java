package sort;

import java.util.Arrays;

public class quick {

	public static void quickSort(int[] arr) {
		if(arr == null || arr.length < 2) return;
		quickSortHelper(arr, 0, arr.length-1);
	}
	
	public static void quickSortHelper(int[] arr, int L, int R) {
		if(L >= R) return;
		
		int[] equalArea = partition(arr, L, R);
		quickSortHelper(arr, L, equalArea[0]-1);
		quickSortHelper(arr, equalArea[1]+1, R);
	}
	
	public static int[] partition(int[] arr, int L, int R) {
		int borderR = -1;
		int borderL = R;
		int index = 0;
		while(index < borderL) {
			if(arr[index] < arr[R]) {
				swap(arr, ++borderR, index++);
			}else if(arr[index] > arr[R]) {
				swap(arr, --borderL, index);
			}else {
				index++;
			}
		}
		swap(arr, borderL, R);
		return new int[] {borderR+1, borderL};
	}
	
	public static void swap(int[] arr, int L, int R) {
		int temp = arr[L];
		arr[L] = arr[R];
		arr[R] = temp;
	}
	
	public static void main(String[] args) {
		int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
				
		quickSort(array);
		
		System.out.println(Arrays.toString(array));

	}

}
