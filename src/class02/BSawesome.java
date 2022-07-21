package class02;
/**
 * 用二分法 在一个无序且互不相同的数组中找到一个局部最小值 
 * @author 15250
 *
 */
public class BSawesome {
	
	public static int awesome(int[] arr) {
		if(arr == null || arr.length == 0) return -1;
		if(arr.length == 1 || arr[0] < arr[1] ) return 0;
		if(arr[arr.length-1] < arr[arr.length-2]) return arr.length-1;
		int L = 1;
		int R = arr.length-2;
		while(L < R) {
			int mid = L + ((R-L)>>1);
			if(arr[mid] > arr[mid-1]) {
				R = mid-1;
			}else if(arr[mid] > arr[mid+1]) {
				L = mid+1;
			}else {
				return mid;
			}
		}
		return L; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
