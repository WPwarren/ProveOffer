package Arithmetic2;

public class Problem_43 {

	public static String LeftRotateString(String str,int n){
		if(str == null || str.length() == 0)
			return "";
		char[] strArray = str.toCharArray();
		swap(strArray,0,n-1);
		swap(strArray,n,strArray.length-1);
		swap(strArray,0,strArray.length-1);
		return new String(strArray);
	}
	private static void swap(char[] strArray, int start, int end) {
		while(start < end){
			char temp = strArray[end];
			strArray[end] = strArray[start];
			strArray[start] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(LeftRotateString("abcXYZde", 3));
	}

}
