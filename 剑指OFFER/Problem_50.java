/*
 *由于数组里的所有数字都在0~n-1的范围内，
 * 所有第i个数字对应的数组下标为i
 * 依次调整数组中元素的位置
 * 
 */

package Arithmetic2;

public class Problem_50 {

	public static boolean duplicate(int numbers[],int length,int[] duplication){
		boolean result = true;
		int index = 0;
		
		if(numbers != null && length >0){
			while(index < length){
				if(numbers[index] == index){
					index++;
				}else{
					if(numbers[numbers[index]] != numbers[index]){
						int temp = numbers[index];
						numbers[index] = numbers[numbers[index]];
						numbers[temp] = temp;
					}else{
						duplication[0] = numbers[index];
						break;
					}
				}
			}
		}
		
		if(index == length)
			result = false;
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1,3,1,4};
		int[] duplication = new int[1];
		System.out.print(duplicate(a, 7, duplication) +", "+duplication[0]);
	}

}
