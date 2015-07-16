package Arithmetic2;

interface Compare{
	public boolean compare(int i);
}

class isEven implements Compare{

	@Override
	public boolean compare(int i) {
		// TODO Auto-generated method stub
		if((i&1)==0)
			return true;
		else
			return false;
	}
}
class isThree implements Compare{

	@Override
	public boolean compare(int i) {
		// TODO Auto-generated method stub
		if((i % 3)==0)
			return true;
		return false;
	}
	
}
public class Problem_13_SEO {

	public static void reOrderArray(int[] a , Compare comp){
		if(a == null){
			return ;
		}
		int n = a.length;
		if(n == 0)
			return;
		int start = 0;
		int end = a.length-1;
		int temp = 0;
		while(start < end){
			while(start<n && comp.compare(a[start]))
				start++;
			while(end>0 && !comp.compare(a[end]))
				end--;
			if(start<end){
				temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,6,7};
//		isEven com = new isEven();
		isThree com1 = new isThree();
		reOrderArray(a,com1);
		for(int i:a){
			System.out.print(i+" ");
		}
	}

}
