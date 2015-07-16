package Arithmetic2;

public class Problem_40 {

	public static void FindNumsAppearOnce(int[] array,int num1[],int num2[]){
		num1[0] = 0;
		num2[0] = 0;
		if(array == null || array.length < 2){
			return;
		}
		
		int result = 0;
		for(int i = 0; i<array.length; i++){
			result ^= array[i];
		}
		
		int index = FindFirstOne(result);
		
		for(int i = 0;i<array.length;i++){
			if(NIsOne(array[i],index)){
				num1[0] ^= array[i];
			}else{
				num2[0] ^= array[i];
			}
		}
		
	}
	private static boolean NIsOne(int data,int index) {
		data = data>> index;
		if((data & 1)==0)
			return false;
		else return true;
	}
	private static int FindFirstOne(int result) {
		int index = 0;
		while((result&1)==0){
			result = result>>1;
			index++;
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,2,3,3,4,4,5,6,6,7,7};
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		
		FindNumsAppearOnce(a,num1,num2);
		System.out.print(num1[0]+","+num2[0]);
	}

}
