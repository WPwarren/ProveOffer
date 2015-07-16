package Arithmetic2;

public class Problem_52 {

	public static boolean match(char[] str,char[] pattren){
		if(str == null || pattren == null)
			return false;
		return matchCore(str,0,pattren,0);
	}
	private static boolean matchCore(char[] str, int start1, char[] pattren,int start2) {
		if(start1==str.length-1 && start2== pattren.length-1)
			return true;
		if(start1!=str.length-1 && start2==pattren.length-1)
			return false;
		
		if(pattren[start2+1] == '*'){
			if(str[start1] == pattren[start2] || start2!=pattren.length-1){
				return matchCore(str,start1+1,pattren,start2+2) ||
						matchCore(str,start1+1,pattren,start2) ||
						matchCore(str,start1,pattren,start2+2);
			}else{
				return matchCore(str,start1,pattren,start2+2);
			}
		}
		
		if((pattren[start2] == '.' && start1!=str.length-1) || (str[start1]==pattren[start2] ))
			return matchCore(str,start1+1,pattren,start2+1);
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
		String pat = "aab*ac*a";
		char[] str = s.toCharArray();
		char[] pattren = pat.toCharArray();
		
		System.out.print(match(str,pattren));
	}

}
