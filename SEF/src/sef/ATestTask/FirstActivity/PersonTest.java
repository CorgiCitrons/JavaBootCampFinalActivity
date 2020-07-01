package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
	
	private Person person;
	
	protected void testsetUp() throws Exception {
		person = new Person();
	}
	public void testSetAndGetFirstName() {
		String testfirstName = "Elina";
		assertNull(person.getFirstName());
		person.setFirstName(testfirstName);
		assertEquals(testfirstName, person.getFirstName());
		
	}
	public void testSetAndGetSecondName() {
		String testsecondName = "Corgi";
		assertNull(person.getSecondName());
		person.setSecondName(testsecondName);
		assertEquals(testsecondName, person.getSecondName());
		
	}
	public void testSetAndGetAge() {
		int testAge = 21;
		assertEquals(0, 0);
		person.setAge(testAge);
		assertEquals(testAge, person.getAge());
		
		
	}
}
