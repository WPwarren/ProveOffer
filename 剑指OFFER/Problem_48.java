package Arithmetic2;

public class Problem_48 {

	public static int Add(int num1,int num2){
		int xor =  0;
		int entrance = 0;
		do{
			xor = num1 ^ num2;
			entrance = (num1 & num2)<<1;
			
			num1 = xor;
			num2 = entrance;
		}while(num2!=0);
		return num1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Add(4,-1));
	}

}
