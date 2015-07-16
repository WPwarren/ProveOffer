package Arithmetic2;

import java.util.ArrayList;

public class Problem_41 {

	public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum){
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		
		int middle = (1+sum)/2;
		int small = 1;
		int big = 2;
		int curSum = small + big;
		
		while(small < middle){
			if(curSum == sum){
				ArrayList<Integer> list = new ArrayList<Integer>();
				FullList(list,small,big);
				lists.add(list);
				big++;
				curSum += big;
			}else if(curSum < sum){
				big++;
				curSum += big;
			}else{
				curSum -= small;
				small++;
			}
		}
		return lists;
	}
	private static void FullList(ArrayList<Integer> list, int small, int big) {
		for(int i=small;i<=big;i++){
			list.add(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(FindContinuousSequence(18));
	}

}
