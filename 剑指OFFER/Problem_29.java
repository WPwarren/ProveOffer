package Arithmetic2;
import static net.mindview.util.Print.*;

public class Problem_29 {
	public static int FindGreatestSumOfSubArray(int[] array){
		int start = 0;
		int begin = 0;
		int end = 0;
		int sum = array[0];
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=1;i<array.length;i++){
			if(sum<0){
				start = i;
				sum = array[i];
			}else{
				sum+=array[i];
			}
			if(sum > maxSum){
				maxSum = sum;
				begin = start;
				end = i;
			}
		}
		print(begin+","+end);
		
		return maxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {6,-3,-2,7,-15,1,2,2};
		System.out.print(FindGreatestSumOfSubArray(a));
	}

}
