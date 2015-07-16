package Arithmetic2;

public class Problem_10 {

	public static int Fibonacci(int n) {
		if(n == 1)
            return 0;
        if(n == 2)
            return 1;
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(Fibonacci(10));
	}

}
