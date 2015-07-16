package Arithmetic2;

public class Problem_30 {

	public static int NumberOf1Between1AndN_Solution(int n){
		int iFactor = 1;
		int iLowerNum = 0;
		int iCurrNum = 0;
		int iHigherNum = 0;
		int count = 0;
		while(n/iFactor != 0){
			iLowerNum = n - (n/iFactor)*iFactor;
			iCurrNum = (n/iFactor)%10;
			iHigherNum = n/(iFactor*10);
			
			if(iCurrNum == 0)
				count += iHigherNum * iFactor;
			else if(iCurrNum == 1)
				count += iHigherNum * iFactor + iLowerNum + 1;
			else 
				count += (iHigherNum+1) * iFactor;
			
			iFactor *= 10;
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		System.out.print(NumberOf1Between1AndN_Solution(n));
	}

}
