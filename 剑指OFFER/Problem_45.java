package Arithmetic2;

import java.util.ArrayList;
import java.util.Collections;

public class Problem_45 {

	public static boolean IsContinuous(ArrayList<Integer> number){
		boolean result = false;
		Collections.sort(number);
		
		int gap = 0;
		int numOfZero = 0;
		
		for(int i=0;i<number.size();i++){
			if(number.get(i) == 0)
				numOfZero++;
		}
		
		int small = numOfZero;
		int big = small+1;
		while(big<number.size()){
			if(number.get(small) == number.get(big) && number.get(small) != 0){
				return false;
			}
			
			gap += number.get(big) - number.get(small) - 1;
			small = big;
			big++;
		}
		if(gap <= numOfZero)
			result = true;
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,3,2,6,4};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(Integer i:a){
			list.add(i);
		}
		System.out.print(IsContinuous(list));
	}

}
