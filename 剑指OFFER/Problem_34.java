package Arithmetic2;

import java.util.HashMap;

public class Problem_34 {

	public static int FirstNotRepeatingChar(String str){
		if(str == null || str.length() == 0)
			return -1;
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}else{
				map.put(str.charAt(i), 1);
			}
		}
		
		for(int i=0;i<str.length();i++){
			if(map.get(str.charAt(i)) == 1)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "jskfjoelwwq;vxiopdaslal;faow";
		System.out.print(FirstNotRepeatingChar(s));
	}

}
