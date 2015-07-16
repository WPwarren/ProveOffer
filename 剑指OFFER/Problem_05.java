package Arithmetic2;

public class Problem_05 {

	public static String replaceSpace(StringBuffer str) {
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				str.replace(i, i+1, "%20");
			}
		}
		return str.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("We are happy!");
		System.out.print(replaceSpace(str));
	}

}
