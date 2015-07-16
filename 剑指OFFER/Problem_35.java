package Arithmetic2;

public class Problem_35 {
	public int InversePairs(int[] array){
		if(array == null || array.length==0)
			return 0;
		int[] copy = array.clone();
		return ReverCount(array,copy,0,array.length-1);
		
	}
	
	private int ReverCount(int[] array, int[] copy, int start, int end) {
		if(start == end){
			copy[start] = array[start];
			return 0;
		}
		int length = (end-start)/2;
		int left = ReverCount(array,copy,start,start+length);
		int right = ReverCount(array,copy,start+length+1,end);
		
		int count = 0;
		int leftIndex = start+length;
		int rightIndex = end;
		int point = end;
		while(leftIndex>=start && rightIndex>=start+length+1){
			if(copy[leftIndex] > copy[rightIndex]){
				count += rightIndex - (start + length);
				array[point--] = copy[leftIndex--];
			}else{
				if(copy[leftIndex] < copy[rightIndex]){
					array[point--] = copy[rightIndex--];
				}else{
					count += rightIndex -(start + length) -1;
					array[point--] = copy[leftIndex--];
					array[point--] = copy[rightIndex--];
				}
			}
		}
		
		for(int i= leftIndex; i>=start;i--)
			array[point--] = copy[i];
		for(int i= rightIndex;i>=start+length+1;i--)
			array[point--] = copy[i];
		
		return left + right + count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem_35 p = new Problem_35();
		int[] a ={1,2,3,4,7,6,5};
		System.out.print(p.InversePairs(a));
	}

}
