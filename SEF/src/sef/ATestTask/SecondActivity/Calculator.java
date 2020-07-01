package sef.ATestTask.SecondActivity;

public class Calculator {
	
	private String calculatorType;
	public static final String CALC_TYPE_BASIC = "Basic";
	
	public Calculator() {}
	
	public Calculator(String calculatorType) {
		this.calculatorType = calculatorType;
	}
	
	public String getCalculatorType() {
		return calculatorType;
	}
	
	public void setCalculatorType(String calculatorType) {
		this.calculatorType = calculatorType;
	}
	
	//Addition
	public double getSum(double x, double y) {
		return x + y;
	}
	
	//Subtraction
	public double getSub(double x, double y) {
		return x - y;
	}
	
	//Multiplication
	public double getMul(double x, double y) {
		return x * y;
	}
	
	//Division
	public double getDiv(double x, double y) {
		if (y==0) {
			throw new ArithmeticException("Argument 'divisor' is 0. Can not delete"); 
		} else {
		return x / y;
		}
	}
}
