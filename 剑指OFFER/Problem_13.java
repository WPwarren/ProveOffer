package Arithmetic2;

public class Problem_13 {

	public static void reOrderArray(int[] a){
		if(a == null){
			return ;
		}
		int n = a.length;
		if(n == 0)
			return ;
		int even = 0;
		boolean proEven = false;
		for(int i=0;i<n;i++){
			if((a[i] & 1 )== 0 && !proEven){
				even = i;
				proEven = true;
			}else if((a[i]&1)==1 && proEven){
				change(a,even,i);
				even = even+1;
			}
		}
	}
	
	public static void change(int[]a, int start, int end){
		int temp  = 0;
		int i = 0;
		temp = a[end];
		for(i=end;i>start;i--){
			a[i] = a[i-1];
		}
		a[i] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7};
		reOrderArray(a);
		for(int i:a){
			System.out.print(i+" ");
		}
	}

}
