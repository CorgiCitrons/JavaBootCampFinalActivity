package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	
	private Student student;
	
	public void testDefCon() {
		Student st = new Student();
		assertEquals ("Unknown", st.getschoolName());
		assertEquals (0, st.getyearEnrolled());
	}
	
	public void testCon() {
		Student st = new Student("Elina", "Sala", 31, "LU", 2007);
		assertEquals("Elina", st.getFirstName());
		assertEquals("Sala", st.getSecondName());
		assertEquals (31, st.getAge());
		assertEquals("LU", st.getschoolName());
		assertEquals (2007, st.getyearEnrolled());
	}
	
	public void testGetSet() {
		Student st = new Student();
		st.setschoolName("University of Latvia");
		assertEquals("University of Latvia", st.getschoolName());
	}
	
	public void testAnn() {
		Student st = new Student("Elina", "Sala", 31, "LU", 2007);
		assertEquals("I am Elina Sala and I am studying at LU.", st.announce());
	}
		
		
	}
}
