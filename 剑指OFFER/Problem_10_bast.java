package Arithmetic2;

public class Problem_10_bast {

	public static long Fibonacci(int n){
		int[] result = {0,1};
		if(n<2){
			return result[n];
		}
		long numOne = 0;
		long numTwo = 1;
		long fiN = 0;
		for(int i=1;i<n;i++){
			fiN = numOne+numTwo;
			
			numOne = numTwo;
			numTwo = fiN;
		}
		return fiN;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Fibonacci(100));
	}
}
