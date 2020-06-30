package sef.ATestTask.FirstActivity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FirstActivity {

	public static void main(String[] args) {
		
//	    ArrayList list = new ArrayList();
		
		Employee e1 = new Employee ("Elina","Sala", 31, 11, "test automation engeneer", "Accenture", 2100);
		Employee e2 = new Employee ("Ana", "Corgi", 45, 12, "manager", "Accenture", 4000);
		Employee e3 = new Employee ("Marcis", "Kalnins", 27, 13, "ScrumMaster", "Accenture", 4500);
		Employee e4 = new Employee ("Helga", "Lapina", 17, 50, "KAM", "Accenture", 3500);
		Employee e5 = new Employee ("John", "Pumpkin", 45, 36, "developer", "Accenture", 3700);
		Employee e6 = new Employee ("Martin", "Knor", 45, 21, "intern", "Accenture", 1000);	
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		
		
		
		BubbleSort(employeeList);
		for (int i = 0; i < employeeList.size(); i++)
			System.out.println(employeeList.get(i).getsalary() + " " + employeeList.get(i).getfirstName() + " " + employeeList.get(i).getSecondName());
	}


public static void BubbleSort(ArrayList<Employee> list)
{
	Employee temp;
	if (list.size()>1)
	{
		for (int i; i < list.size()-i; i++) {
			if(list.get(i).compareTo(list.get(i+1))>0)
			{
				temp = list.get(i);
				list.set(i, list.get(i+1));
				list.set(i+1, temp);
			}
		}
	}
}

		
		

//		list.add(e2);
//		list.add(e3);
//		list.add(e4);
//		list.add(e5);
//		list.add(e6);

		//TODO 1 Create collection of employee (more than 5) list or map
		
		//		System.out.println() result
//		System.out.println(e1);
//		System.out.println(e2);
//		System.out.println(e3);
//		System.out.println(e4);
//		System.out.println(e5);
//		System.out.println(e6);
		

//		FirstActivity obj = new FirstActivity();
//				obj.print(list);
//	}
//	 void print(List l) {
//		Iterator i = l.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
	
		

		//TODO 2 sort and this employees by salary (from min to max)
		// TIP - google bubble sort
		//		System.out.println() result
//		void bubbleSort(int arr[])
//		{
//			int n = arr.length;
//			for (int i = 0; i < n-1; i++)
//				for (int j = 0; j < n-i-1; j++)
//					if(arr[j]>arr[j+1])
//					{
//						int temp = arr[j];
//						arr[j] = arr[j+1];
//						arr[j+1] = temp;
//					}
//		}
//		void printArray(int arr[])
//		{
//			int n = arr.length;
//			for (int i=0; i < n; ++i)
//				System.out.print(arr[i]+" ");
//			System.out.println();
//		}
//		static void main(String[] args) {
//		}
//		
////		
		

		//TODO 3 create instance of a Student as a Person ->
		// than ask him introduce()
		// than make them Student
		// than ask him introduce()

		//TODO 4 Create method for full change of employee information
		// for example some employee change his work


	}

	
	
}
//4) in file FirstActivity
//4.1 create few employees
//4.2 try to print them from top salary to less