package Arithmetic2;

public class Problem_37 {

	public static int GetNumberOfK(int [] array , int k) {
        int start = 0;
        int end = array.length;
      	int middle = (start + end)/2;
        while(middle>0 && middle<array.length && array[middle]!= k){
            if(array[middle] < k){
                end = middle -1;
            }else{
                start = middle + 1;
            }
            middle = (start + end)/2;
        }
        
        int count = 0;
        if(middle>=0 && middle<array.length){
	        for(int i= middle;i>=0 && array[i] == k;i--){
	            count++;
	        }
	        for(int i = middle+1;i<array.length && array[i] == k;i++){
	            count++;
	        }
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,3,3,3,4,5};
		System.out.print(GetNumberOfK(a,2));
	}

}
