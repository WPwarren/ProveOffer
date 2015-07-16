package Arithmetic2;

public class Problem_44 {

	public static String ReverseSentence(String str){
		if(str==null || str.length()==0)
			return "";
		int start = 0;
		int end = 0;
		char[] strArray = str.toCharArray();
		for(;end<strArray.length;end++){
			if(strArray[end] == ' '){
				swap(strArray,start,end);
				end++;
				start = end;
			}
		}
		swap(strArray,start,end);
		swap(strArray,0,str.length());
		
		
		return new String(strArray);
	}
	
	private static void swap(char[] strArray, int start, int end) {
		end --;
		while(start < end){
			char temp = strArray[start];
			strArray[start] = strArray[end];
			strArray[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am a student.";
		System.out.print(ReverseSentence(s));
	}

}
