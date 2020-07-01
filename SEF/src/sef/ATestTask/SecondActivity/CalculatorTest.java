package sef.ATestTask.SecondActivity;
// Complete Code
import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {


	//TODO try to achieve 100% of test coverage

	private Calculator testCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		testCalculator = new Calculator();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	//Example ->
	@Test
	public void testSummarize() {
		double x = 5;
		double y = 10.1;
		//both positive
		assertEquals(15.1, (testCalculator.getSum(x,y)));
		assertEquals(15.1, (testCalculator.getSum(y,x)));
		
		//one positive, other negative
		x=-5;
		y=10.1;
		assertEquals(5.1, (testCalculator.getSum(x,y)));
		assertEquals(5.1, (testCalculator.getSum(y,x)));
		
		//both negative
		x=-5.1;
		y=-10;
		assertEquals(-15.1, (testCalculator.getSum(x,y)));
		assertEquals(-15.1, (testCalculator.getSum(y,x)));
	}
	@Test
	public void testSubstraction() {
		double x = 5;
		double y = 10.1;
		//both positive
		assertEquals(-5.1, (testCalculator.getSub(x,y)));
		assertEquals(5.1, (testCalculator.getSub(y,x)));
		
		//one positive, other negative
		x=-5;
		y=10.1;
		assertEquals(-15.1, (testCalculator.getSub(x,y)));
		assertEquals(15.1, (testCalculator.getSub(y,x)));
		
		//both negative
		x=-5.1;
		y=-10;
		assertEquals(4.9, (testCalculator.getSub(x,y)));
		assertEquals(-4.9, (testCalculator.getSub(y,x)));
	}
	@Test
	public void testMultiplication() {
		double x = 2.5;
		double y = 10;
		//both positive
		assertEquals(25.0, (testCalculator.getMul(x,y)));
		assertEquals(25.0, (testCalculator.getMul(y,x)));
		
		//one positive, other negative
		x=-2.5;
		y=10;
		assertEquals(-25.0, (testCalculator.getMul(x,y)));
		assertEquals(-25.0, (testCalculator.getMul(y,x)));
		
		//both negative
		x=-2.5;
		y=-10;
		assertEquals(25.0, (testCalculator.getMul(x,y)));
		assertEquals(25.0, (testCalculator.getMul(y,x)));
	}
	@Test
	public void testDivision() {
		double x = 2.5;
		double y = 10;
		//both positive
		assertEquals(0.25, (testCalculator.getDiv(x,y)));
		assertEquals(4.0, (testCalculator.getDiv(y,x)));
		
		//one positive, other negative
		x=-2.5;
		y=10;
		assertEquals(-0.25, (testCalculator.getDiv(x,y)));
		assertEquals(-4.0, (testCalculator.getDiv(y,x)));
		
		//both negative
		x=-2.5;
		y=-10;
		assertEquals(0.25, (testCalculator.getDiv(x,y)));
		assertEquals(4.0, (testCalculator.getDiv(y,x)));
	}
	
	@Test(expected=ArithmeticException.class)
	public void divideException() {
		testCalculator.getDiv(2, 0);
	}
}
