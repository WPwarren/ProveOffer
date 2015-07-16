package Arithmetic2;

public class Problem_51 {

	public static int[] multiply(int[] A){
		if(A == null || A.length == 0)
			return null;
		int len = A.length;
		int[] B = new int[len];
		int[] C = new int[len];
		int[] D = new int[len];
		
		int i;
		C[0] = 1;
		for(i=1;i<=len-1;i++){
			C[i] = A[i-1]*C[i-1];
		}
		D[len-1] = 1;
		for(i=len-2;i>=0;i--){
			D[i] = A[i+1]*D[i+1];
		}
		
		for(i=0;i<len;i++){
			B[i] = C[i]*D[i];
		}
		return B;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		int[] b = multiply(a);
		for(int i: b){
			System.out.print(i+" ");
		}
		
	}

}
