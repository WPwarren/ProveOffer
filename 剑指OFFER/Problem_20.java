package Arithmetic2;

import java.util.ArrayList;
import java.util.Stack;

public class Problem_20 {

	public static boolean IsPopOrder(ArrayList<Integer> pushA, ArrayList<Integer> popA){
		boolean result = false;
		
		if(pushA == null && popA == null)
            return true;
        else if(pushA == null)
            return false;
        else if(popA == null)
            return false;
		
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(pushA.get(0));
		
		int len1 = pushA.size();
		int len2 = popA.size();
		
		if(len1 != len2)
			return false;
		
		int index_push = 1;
		int index_pop = 0;
		
		while(index_pop < len2)
		{
//			出栈序列与辅助栈顶不等，输入序列压栈
			while(index_push <len2 && s1.peek() != popA.get(index_pop)){
				s1.push(pushA.get(index_push));
				index_push++;
			}
			
			if(s1.peek() == popA.get(index_pop)){
				s1.pop();
				index_pop++;
			}else{
				break;
			}
		}
		
		if(index_pop == len2)
			result = true;
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {};
		int[] b = {};
		ArrayList<Integer> pushA = new ArrayList<Integer>();
		ArrayList<Integer> popA = new ArrayList<Integer>();
		for(int i:a)
			pushA.add(i);
		for(int i:b)
			popA.add(i);
		System.out.print(IsPopOrder(pushA,popA));
	}

}
