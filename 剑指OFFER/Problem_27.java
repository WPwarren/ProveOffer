package Arithmetic2;

public class Problem_27 {

	public static int MoreThanHalfNum_Solution(int[] array){
		int count = 1;
		int flag = array[0];
		int n = array.length;
		int index = 1;
		while(index<n){
			if(flag == array[index])
				count++;
			else{
				count--;
				if(count == 0){
					index++;
					flag = array[index];
					count++;
				}
			}
			
			index++;
		}
		
		int num = 0;
		for(int i=0;i<n;i++){
			if(array[i] == flag)
				num++;
		}
		
		if(num > n/2)
			return flag;
		else
			return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,2,2,2,5,4,2};
		System.out.print(MoreThanHalfNum_Solution(a));
	}

}
