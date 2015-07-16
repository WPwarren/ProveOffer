package Arithmetic2;

public class Problem_11 {

	public static double Power(double base,int exponent){
		boolean flag = false;
		if(exponent <0){
			flag = true;
			exponent = -exponent;
		}
//		double result = PowerResult(base,exponent);
		if(exponent == 0)
			return 1;
		if(exponent == 1)
			return base;
		
		double result = Power(base,exponent>>1);
		result *= result;
		if((exponent&0x1)==1){
			result *=base;
		}
		
		if(flag){
			result = 1.0/result;
		}
		return result;
	}
	
	public static double PowerResult(double base,int exponent){
		if(exponent == 0)
			return 1;
		if(exponent == 1)
			return base;
		
		double result = Power(base,exponent>>1);
		result *= result;
		if((exponent&0x1)==1){
			result *=base;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Power(2,-5));
	}

}
