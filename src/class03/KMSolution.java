package class03;

import java.util.HashMap;

public class KMSolution {
	/**
	 * 一个数组中，只有一个数出现了k次，其他的数都是出现了m次 k>=1 k<m
	 * 
	 * @param arr
	 * @return
	 */
	public static int KM(int[] arr, int k, int m) {
		int[] t = new int[32];
		for (int num : arr) {
			for (int i = 0; i < 32; i++) {
				t[i] += (num >> i) & 1;
			}
		}
		int ans = 0;
		for (int i = 0; i < 32; i++) {
			if((t[i] % m) == 0) {
				continue;
			}
			if ((t[i] % m) == k) {
				ans |= 1 << i;
			}else {
				return -1;
			}
		}
		return ans;
	}
	
	public static int test(int[] arr, int k, int m) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int num : arr) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		for(int num : map.keySet()) {
			if(map.get(num) == k) return num;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 9, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int ans = KM(arr, 3, 2);
		int ans1 = test(arr, 3, 2);
		System.out.println(ans + " " + ans1);
	}

}
