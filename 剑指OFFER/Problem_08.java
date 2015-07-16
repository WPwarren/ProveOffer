package Arithmetic2;

import java.util.Stack;

public class Problem_08 {

	public Stack<Integer> s1 = new Stack<Integer>();
	public Stack<Integer> s2 = new Stack<Integer>();
	
	public void push(int data){
		s1.push(data);
	}
	public int pop(){
		int result ;
		if(s2.isEmpty()){
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
		result = s2.pop();
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
