package class02;

public class BSnearestLeft {
	//���ش��ڵ���num����ߵ�Ԫ�ص��±�
	public static int nearestLeft(int[] arr, int num) {
		int L = 0;
		int R = arr.length-1;
		int ans = -1;
		while(L <= R) {
			int mid = L + ((R-L)>>1);
			if(arr[mid] >= num) {
				ans = mid;
				R = mid -1;
			}else {
				L = mid+1;
			}
		}
		return ans;
	}
	
	//����С�ڵ���num���ұߵ�Ԫ�ص��±�
	public static int nearestRight(int[] arr, int num) {
		int L = 0;
		int R = arr.length-1;
		int ans = -1;
		while(L <= R) {
			int mid = L + ((R-L) >> 1);
			if(arr[mid] <= num) {
				ans = mid;
				L = mid+1;
			}else {
				R = mid-1;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] array = {1,2,2,3,4,5,6,6,6,7,9};
		int a = nearestRight(array, 3);
		System.out.println(a);
	}

}
