package Arithmetic2;

public class Problem_46 {

	public static int LastRemaining_Solution(int n,int m){
		if(n<=0 || m<=0)
            return -1;
        
        int last = 0;
        for(int i=2;i<=n;i++){
            last = (last+m)%i;
        }
        return last;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(LastRemaining_Solution(5,3));
	}

}
