package Arithmetic2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Problem_28 {

	public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k){
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(input == null || input.length == 0)
			return list;
		
		int start = 0;
		int end = input.length-1;
		int index = Partation(input,start,end);
		
		while(index != k-1){
			if(index < k-1){
				start = index+1;
				index = Partation(input,start,end);
			}else if(index > k-1){
				end = index -1;
				index = Partation(input,start,end);
			}
		}
		
		for(int i=0;i<=index;i++)
			list.add(input[i]);
		Collections.sort(list);
		return list;
	}
	private static int Partation(int[] input, int start, int end) {
		Random rand = new Random();
		int index = rand.nextInt(end-start)+start;
		swap(input,index,end);
		int small = start - 1;
		for(int i= start;i<end;i++){
			if(input[i] < input[end]){
				small++;
				swap(input,small,i);
			}
		}
		small++;
		swap(input,small,end);
		return small;
	}
	
	private static void swap(int[] input, int index, int end) {
		// TODO Auto-generated method stub
		int temp = input[index];
		input[index] = input[end];
		input[end] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,1,6,2,7,3,8};
		ArrayList<Integer> list = GetLeastNumbers_Solution(a,4);
		System.out.print(list);
	}

}
