package Arithmetic2;

import java.util.ArrayList;

public class Problem_33 {
	public static int GetUglyNumber_Solution(int index){
		if(index <= 0)
			return -1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		int max2 = 0;
		int max3 = 0;
		int max5 = 0;
		int count = 0;
		int max = Integer.MIN_VALUE;
		
		while(count != index){
			for(int i=index2 ;i<list.size();i++){
				if(list.get(i)*2 > max){
					max2 = list.get(i) * 2;
					index2 = i;
					break;
				}
			}
			
			for(int i=index3;i<list.size();i++){
				if(list.get(i)*3 > max){
					max3 = list.get(i) *3;
					index3 = i;
					break;
				}
			}
			
			for(int i = index5;i<list.size();i++){
				if(list.get(i)*5 > max){
					max5 = list.get(i)*5;
					index5 = i;
					break;
				}
			}
			max = MinNum(max2,max3,max5);
			list.add(max);
			count++;
		}
		
		return list.get(count-1);
	}
	
	public static int MinNum(int n1,int n2,int n3){
		n1 = n1 < n2 ? n1 : n2;
		return n1 < n3 ? n1 : n3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(GetUglyNumber_Solution(1));
	}

}
