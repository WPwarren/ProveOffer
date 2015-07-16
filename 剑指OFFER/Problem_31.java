package Arithmetic2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Problem_31 {

	public static String PrintMinNumber(int[] num){
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<num.length;i++){
			list.add(Integer.toString(num[i]));
		}
		
		Collections.sort(list, new Compare());
		String result = "";
		for(int i=0;i<list.size();i++)
			result += list.get(i);
		
		return result;
	}
	
	public static class Compare implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			String s1 = o1+o2;
			String s2 = o2+o1;
			return s1.compareTo(s2);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={3,32,321};
		System.out.print(PrintMinNumber(a));
	}

}
