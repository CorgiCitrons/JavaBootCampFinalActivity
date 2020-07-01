package sef.ATestTask.SecondActivity;
// Complete Code
public class SecondActivity {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		System.out.println("**** See Your results below! ****");


		//TODO Use the calculator to calculate different values
		//Example ->
		//calculator.sum(10.2, 5);
		double result = myCalc.getSum(10.2, 5);
		System.out.println("1. Addition result is " + result);
		
		
		//calculator.divide(100, 33);
		try {
			double result1 = myCalc.getDiv(100,  33);
			System.out.println("2. Division resuls is " + result1);
		}catch (ArithmeticException e) {
			System.out.println ("2. Can not divide by 0!!!");
			}
		
		// and more
		
		double result2 = myCalc.getMul(4,  13.4);
		System.out.println("3. Multiplication result is " + result2);
		
		double result3 = myCalc.getSub(8, -12);
		System.out.println("4. Multiplication result is " + result3);
	}

	//TODO create the Calculator (here or in additional class)

}
