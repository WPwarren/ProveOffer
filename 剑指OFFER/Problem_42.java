package Arithmetic2;

import java.util.ArrayList;

public class Problem_42 {
	public static ArrayList<Integer> FindNumbersWithSum(int[] array,int sum){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(array == null || array.length == 0){
			return list;
		}
		int small = 0;
		int big = array.length-1;
		int curSum = array[small] + array[big];
		
		
		while(small < big){
			if(curSum == sum){
				if(list.size() == 0){
					list.add(array[small]);
					list.add(array[big]);
				}else{
					int temp = list.get(0) * list.get(1);
					if(temp > array[small]*array[big]){
						list.clear();
						list.add(array[small]);
						list.add(array[big]);
					}
				}
				small++;
				big--;
			}else if(curSum < sum){
				small++;
			}else{
				big--;
			}
			
			curSum = array[small] + array[big];
		}
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.print(FindNumbersWithSum(a, 21));
	}

}
