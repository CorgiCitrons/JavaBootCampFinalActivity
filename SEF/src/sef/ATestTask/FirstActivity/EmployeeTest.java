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
}