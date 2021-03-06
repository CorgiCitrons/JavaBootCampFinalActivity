package sef.ATestTask.FirstActivity;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FirstActivity {

	public static void main(String[] args) {

		Employee e1 = new Employee ("Elina","Sala", 31, 11, "test automation engeneer", "Accenture", 2100);
		Employee e7 = new Employee ("Ana", "Corgi", 45, 12, "manager", "Accenture", 4000);
		Employee e3 = new Employee ("Marcis", "Kalnins", 27, 13, "ScrumMaster", "Accenture", 4500);
		Employee e4 = new Employee ("Helga", "Lapina", 17, 50, "KAM", "Accenture", 3500);
		Employee e5 = new Employee ("John", "Pumpkin", 45, 36, "developer", "Accenture", 3700);
		Employee e6 = new Employee ("Martin", "Knor", 45, 21, "intern", "Accenture", 1000);
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(e1);
		emplist.add(e7);
		emplist.add(e3);
		emplist.add(e4);
		emplist.add(e5);
		emplist.add(e6);
		
		
		//old list
		System.out.println("not sorted list");
		for (Employee emp : emplist) {
            System.out.println("Salary: " + emp.getsalary());
            System.out.println("Name: " + emp.firstName + " " + emp.secondName + "; Position: " + emp.getjobTitle());
		}
		
		//TODO 2 sort and this employees by salary (from min to max)

		Collections.sort(emplist, new SalaryOrder());
		 
		//sorted list
		System.out.println("*************************************");
		System.out.println("sorted list by salary");
		for (Employee emp : emplist) {
            System.out.println("Salary: " + emp.getsalary());
            System.out.println("Name: " + emp.firstName + " " + emp.secondName + "; Position: " + emp.getjobTitle());

		}
//		System.out.println("*************************************");
//		System.out.println("sorted list by name");
//	}
//	
//		Arrays.sort(emplist, new NameComparator();
//		for(int i=0; i < emplist.lenght; i++){
//			 System.out.println("Salary: " + emp.getsalary());
//			 System.out.println("Name: " + emp.firstName + " " + emp.secondName + "; Position: " + emp.getjobTitle());
//		}
//		
		

		//TODO 3 create instance of a Student as a Person ->
		
		System.out.println("*************************************");
		Person p = new Student("Hanna", "Tiger", 21, "University of Latvia", 2019);
		p.introduce(); 		// than ask him introduce()
		Student s = (Student) p; 	// than make them Student
		s.introduce();
		
	// than ask him introduce()

		//TODO 4 Create method for full change of employee information
	

		
		System.out.println("*************************************");
		// for example some employee change his work
	for (int i = 0; i <emplist.size();i++) {
		if(i % 2 !=0)emplist.get(i).setjobTitle("teacher");
	}
	emplist.forEach(emp -> {
		System.out.println(emp.announce());
	
	});
}
}

