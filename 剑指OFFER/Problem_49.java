/*
�ж�����
�����ֲ���ת��ΪInt��
	ÿ�鿴һ���ַ������ж��Ƿ�Ϸ�
    ÿת��һ���ַ����ж�������û��Խ��

��һ����ʶ����ʾ�����Ƿ�Ϸ�
*/
package Arithmetic2;

public class Problem_49 {

	public static boolean  Illegal = false;
	public static int StrToInt(String str){
		boolean minus = false;
		int start = 0;
		long num = 0;
		if(str != null && str.length()!=0){
			if(str.charAt(0) == '+')
				start++;
			else if(str.charAt(0) == '-'){
				minus = true;
				start++;
			}
			str = str.substring(start);
			num = ConvertToInt(str,minus);
		}
		
		return (int)num;
	}
	private static long ConvertToInt(String str, boolean minus) {
		int flag = minus?-1:1;
		
		char[] strArray = str.toCharArray();
		int index = 0;
		long num = 0;
		
		while(index < strArray.length){
			if(strArray[index]>='0' && strArray[index]<='9'){
				num = num*10 + flag*(strArray[index]-'0');
				
				if((!minus && num>0x7fffffff) || num<0x80000000){
					num = 0;
					break;
				}
			}else{
				num = 0;
				break;
			}
			index++;
		}
		
		if(index == strArray.length)
			 Illegal = true;
		return num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "+";
		System.out.print(StrToInt(s));
	}

}
