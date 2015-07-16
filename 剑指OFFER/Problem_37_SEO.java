package Arithmetic2;

public class Problem_37_SEO {

	public static int GetNumberOfK(int[] array,int k){
		int number = 0;
		if(array != null && array.length !=0){
			int first = GetFirstNumOfK(array,k,0,array.length-1);
			int last = GetLastNumOfK(array,k,0,array.length-1);
			
			if(first > -1 && last > -1){
				number = last - first + 1;
			}
		}
		
		return number;
	}
	private static int GetLastNumOfK(int[] array, int k, int start, int end) {
		if(start > end)
			return -1;
		int middle = (start + end)/2;
		int data = array[middle];
		if(data == k){
			if((middle<array.length-1 && array[middle + 1] != k) || middle == array.length-1){
				return middle;
			}else{
				start = middle + 1;
			}
		}else if(data < k){
			start = middle + 1;
		}else
			end = middle - 1;
		return GetLastNumOfK(array,k,start,end);
	}
	private static int GetFirstNumOfK(int[] array, int k, int start, int end) {
		if(start > end)
			return -1;
		
		int middle = (start + end)/2;
		int data = array[middle];
		if(data == k){
			if((middle>0 && array[middle-1]!= k)|| middle == 0)
				return middle;
			else
				end = middle -1;
		}else if(data < k){
			start = middle +1;
		}else
			end = middle-1;
			
		return GetFirstNumOfK(array,k,start,end);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,3,3,3};
		System.out.print(GetNumberOfK(a, 3));
	}

}
