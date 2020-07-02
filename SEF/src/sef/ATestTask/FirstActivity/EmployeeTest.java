package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void testcheckEmployeeCreatedProperly() throws CustomExceptionPerson {
        Employee employee = new Employee();
        employee.setFirstName("Unknown");
        assertEquals("I am an error message", "Unknown", employee.getFirstName());
    }
    
    public void checkDefConst() {
    	Employee e = new Employee();
    	assertEquals(1, e.getempId());
    	assertEquals("manager", e.getjobTitle());
    	assertEquals("Evolution", e.getcompanyName());
    	assertEquals(1000.99, e.getsalary());
    }
    
    public void checkEmpConst() {
    	Employee e = new Employee("Zane", "Auzina", 41, 234, "teacher", "Amazing School", 700.00);
    	assertEquals("Zane",e.getFirstName());
    	assertEquals("Auzina", e.getSecondName());
    	assertEquals(41, e.getAge());
    	assertEquals(234, e.getempId());
    	assertEquals("teacher", e.getjobTitle());
    	assertEquals("Amazing School", e.getcompanyName());
    }
    
    public void checkGetSet() {
    	Employee e = new Employee();
    		e.setempId(234);
    		e.setjobTitle("teacher");
    		e.setcompanyName("Amazing School");
    		e.setsalary(700.00);
    }
    
    public void checkAnnounce() {
    	Employee e = new Employee ("Anna", "Kalnina", 31, 555, "barista", "Muffin", 895.00);
    	assertEquals("My name is Anna Kalnina and i am 31 years young. I work as barista in Muffin", e.announce()); 		
    }
}