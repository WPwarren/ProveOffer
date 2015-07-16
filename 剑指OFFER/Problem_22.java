package Arithmetic2;


public class Problem_22 {

	public static boolean VerifySquenceOfBST(int[] sequence){
		if(sequence == null || sequence.length <=0)
			return false;
		return isSquenceOfBST(sequence,0,sequence.length);
	}
	private static boolean isSquenceOfBST(int[] sequence, int start, int end) {

		
		int root = sequence[end-1];
		int i=start;
		for(;i<end-1;i++){
			if(sequence[i]>root)
				break;
		}
		
		int j = i;
		for(;j<end-1;j++){
			if(sequence[j]<root)
				return false;
		}
		
		boolean left = true;
		if(i>start)
			left = isSquenceOfBST(sequence, start, i);
		boolean right = true;
		if(i<end-1)
			right = isSquenceOfBST(sequence, i, end-1);
		
		return (left && right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,7,6,9,11,10,8};
		System.out.print(VerifySquenceOfBST(a));
	}

}
