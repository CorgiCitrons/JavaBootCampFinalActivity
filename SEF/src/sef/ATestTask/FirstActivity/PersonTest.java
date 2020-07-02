package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
	
	private Person person;
	
	public void checkDefVal() {
		Person h = new Person();
		assertEquals("Unknown", h.getFirstName());
		assertEquals("Unknown", h.getSecondName());
		assertEquals(0, h.getAge());
	}
	public void testInputCon() {
		Person h = new Person("Elina","Sala",31);
		assertEquals("Elina",h.getFirstName());
		assertEquals("Sala",h.getSecondName());
		assertEquals(31, h.getAge());
		
	}
	public void testSetAndGetAge() {
		Person a3 = new Person();
		int testAge = 21;
		assertEquals(0, 0);
		a3.setAge(testAge);
		assertEquals(testAge, a3.getAge());
	}
	public void testThrowErrFirstName() {
		Person h = new Person();
		try {
			h.setFirstName("Elina2");
		} catch (CustomExceptionPerson e) {
			assertEquals("You can not input information with numbers and symbols!", e.getMessage());
		}
	}
	public void testThrowErrSecondName() {
		Person h = new Person();
		try {
			h.setSecondName("Sa2la");
		} catch (CustomExceptionPerson e) {
			assertEquals("You can not input information with numbers and symbols!", e.getMessage());
		}
	}
	public void testIntroduction () {
		Person h = new Person("Elina", "Sala", 31);
		assertEquals("I am Elina Sala and i am 31 years young.", h.announce());
	}
}
