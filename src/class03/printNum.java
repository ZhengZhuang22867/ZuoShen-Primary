package class03;

public class printNum {
	
	/**
	 * arr���������������������Σ�������������ż���Σ�������������
	 * @param arr
	 */
	public static int[] printOddTimesNum(int[] arr) {
		//�øñ������������ֵ
		int eor = 0;
		for(int num : arr) {
			eor ^= num;
		}//���յõ���eorΪnum1 ^ num2
		
		//��ȡeor���ұߵ�1
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
