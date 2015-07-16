package Arithmetic2;

public class Problem_53 {

	public boolean isNumeric(char[] str){
		if(str==null || str.length==0)
			return false;
		int[] index = {0};
		if(str[0] == '-' || str[0] == '+')
			index[0]++;
		if(index[0] == str.length)
			return false;
		
		scanDigits(str,index);
		boolean numeric = true;
		
		if(index[0] != str.length){
			if(str[index[0]] == '.'){
				index[0]++;
				scanDigits(str,index);
				if(index[0] < str.length && (str[index[0]]=='e' || str[index[0]]=='E')){
					numeric = isExponential(str, index);
				}
				
			}else if(str[index[0]]=='e' || str[index[0]]=='E'){
				numeric = isExponential(str,index);
			}else{
				numeric = false;
			}
		}
		return numeric && index[0] == str.length;
	}
	private boolean isExponential(char[] str, int[] index) {
		if(str[index[0]]!='e' && str[index[0]]!='E'){
			return false;
		}
		
		index[0]++;
		if(index[0] == str.length)
			return false;
		if(str[index[0]]=='-' || str[index[0]]=='+')
			index[0]++;
		if(index[0] == str.length)
			return false;
		
		scanDigits(str,index);
		
		return index[0]==str.length ? true:false;
	}
	private void scanDigits(char[] str, int[] index) {
			while(index[0]<str.length && str[index[0]]>='0' && str[index[0]]<='9')
				index[0]++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem_53 p = new Problem_53();
		String s = "600.";
		System.out.print(p.isNumeric(s.toCharArray()));
	}

}
