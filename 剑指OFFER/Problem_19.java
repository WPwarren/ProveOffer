package Arithmetic2;

import java.util.Stack;

public class Problem_19 {
	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();
	
	public static void push(int node){
		if(s2.isEmpty())
			s2.push(node);
		else if(s2.peek()>node)
			s2.push(node);
		
		s1.push(node);
	}
	
	public static void pop(){
		if(s1.peek() == s2.peek())
		{
			s2.pop();
		}
		s1.pop();
	}
	
	public int top(){
		return s1.peek();
	}
	
	public static int min(){
		return s2.peek();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push(3);
		System.out.println(min());
		push(4);
		System.out.println(min());
		push(2);
		System.out.println(min());
		push(3);
		System.out.println(min());
		pop();
		System.out.println(min());
		pop();
		System.out.println(min());
		pop();
		System.out.println(min());
		push(0);
		System.out.println(min());
		
	}

}
