package sef.ATestTask.SecondActivity;

public class Fibonacci_number {
	
	static void printFibonacciNumber (int n)
	{
		int f1 = 0, f2 = 1, i;
		
		if (n<1)
			return;
		for (i=1; i<=n;i++)
		{
			System.out.print(f2+" ");
			int next = f1 + f2;
			f1=f2;
			f2=next;
		}
	}
	
	public static void main(String[] args)
	{
		printFibonacciNumber(11);
	}

}
