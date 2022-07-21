package class03;

public class printNum {
	
	/**
	 * arr中有两种数出现了奇数次，其他数都出现偶数次，返回这两种数
	 * @param arr
	 */
	public static int[] printOddTimesNum(int[] arr) {
		//用该变量保存异或后的值
		int eor = 0;
		for(int num : arr) {
			eor ^= num;
		}//最终得到的eor为num1 ^ num2
		
		//获取eor最右边的1
		//eor:		01001011011010
		//rightOne: 00000000000010
		int rightOne = eor ^ (-eor);
		int num1 = 0;
		for(int num : arr) {
			if((num & rightOne) != 0) {
				num1 ^= num;
			}
		}
		int num2 = eor^num1;
		return new int[]{num1, num2};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
