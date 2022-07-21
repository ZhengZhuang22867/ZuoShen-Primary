package class02;

public class BSexist {
	
	public static boolean exist(int[] arr, int num) {
		int L = 0;
		int R = arr.length-1;
		int mid = 0;
//		while(L <= R) {
//			mid = L + ((R-L) >> 1);
//			if(arr[mid] == num) {
//				return true;
//			}else if(arr[mid] > num){
//				R = mid-1;
//			}else {
//				L = mid+1;
//			}
//		}
//		return false;
		while(L < R) {
			mid = L + ((R-L) >> 1);
			if(arr[mid] == num) {
				return true;
			}else if(arr[mid] > num){
				R = mid-1;
			}else {
				L = mid+1;
			}
		}
		return arr[L] == num;
	}
	
	public static void main(String[] args) {
		
		int[] array = {1,2,2,3,3,5,6,6,6,7,9};
		
		System.out.println(exist(array, 8));
	}

}
