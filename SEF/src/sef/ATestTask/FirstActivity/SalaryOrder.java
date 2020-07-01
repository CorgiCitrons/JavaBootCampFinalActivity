package sef.ATestTask.FirstActivity;

import java.util.Comparator;

public class SalaryOrder implements Comparator<Employee> {
	public int compare(Employee arg0, Employee arg1) {
		if(arg0.getsalary()>arg1.getsalary())
			return 1;
		else if(arg0.getsalary()<arg1.getsalary())
			return -1;
		else
			return 0;
	}
	

}
