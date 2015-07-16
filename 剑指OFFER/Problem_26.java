package Arithmetic2;

import java.util.ArrayList;

public class Problem_26 {

	public static ArrayList<String> Permutation(String str){
		ArrayList<String> list = new ArrayList<String>();
		if(str== null || str.length() == 0)
			return list;
		char[] strArray = str.toCharArray();
		Count(strArray,0,list);
		return list;
	}
	
	private static void Count(char[] str, int start, ArrayList<String> list) {
		if(start == str.length-1)
			list.add(new String(str));
		else{
			int i=start;
			for(;i<str.length;i++){
				if(FirstMatch(str,str[i],start) == i){
					char temp = str[i];
					str[i] = str[start];
					str[start] = temp;
					
					Count(str,start+1,list);
					
					temp = str[i];
					str[i] = str[start];
					str[start] = temp;
				}
			}
		}
	}
	private static int FirstMatch(char[] str, char c, int start) {
		int i=start;
		for(;i<str.length;i++)
			if(str[i] == c)
				break;
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aa";
		System.out.print(Permutation(s)+" ");
	}

}
