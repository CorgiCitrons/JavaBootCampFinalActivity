package sef.ATestTask.FirstActivity;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {

    public void testcheckEmployeeCreatedProperly() throws CustomExceptionPerson {
        Employee employee = new Employee();
        employee.setFirstName("Test");
        assertEquals("I am an error message", "Test", employee.getFirstName());
    }

}