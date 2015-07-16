package Arithmetic2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Problem_64 {

	static ArrayList<Integer> maxInWindows(int[] num,int size){
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(num ==null || num.length==0|| size<=0){
			return list;
		}
		
		LinkedList<Integer> sort = new LinkedList<Integer>();
		int index = 0;
		
		while(index<num.length){
			if(sort.isEmpty()){
				sort.add(index);
				index++;
			}else{
				if(sort.peek() < index-size+1){
					sort.poll();
				}
				
				while(!sort.isEmpty() && num[index]>num[sort.getLast()]){
					sort.removeLast();
				}
				sort.add(index);
				
				index++;
			}
			if(index>=size ){
				list.add(num[sort.getFirst()]);
			}
			
		}
		
		
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,4,2,6,2,5,1};
		System.out.print(maxInWindows(a,3));
	}

}
