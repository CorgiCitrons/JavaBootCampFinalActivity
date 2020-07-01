package sef.ATestTask.FirstActivity;

public class Employee extends Person {

    private int empId;
    private String jobTitle;
    private String companyName;
    private double salary;

    //TODO 1 create different constructors
    public Employee(){
    	this.empId=0;
    	this.jobTitle="Unknown";
    	this.companyName="Unknown";
    	this.salary=0;
    }
	public Employee(String firstName, String secondName, int age, int empId, String jobTitle, String companyName, double salary){
		super(firstName, secondName, age);
		this.empId = empId;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.salary = salary;
	}
    //TODO 2 add getters and setters
	public int getempId() {
		return empId;
	}
	public void setempId(int empId) {
		this.empId = empId;
	}

	public String getjobTitle() {
		return jobTitle;
	}
	public void setjobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public String getcompanyName() {
		return companyName;
	}

	public void setcompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary = salary;
	}



    //TODO 3 override method announce()
	public String announce() {
		return "My name is " + getFirstName() + " and i am " + getAge() + " years young. I work as " + getjobTitle() + " in " + getcompanyName() + ".";
	}
	public  void introduce() {
		System.out.println("My name is " + getFirstName() + " and i am " + getAge() + " years young. I work as " + getjobTitle() + " in " + getcompanyName() + ".");
	}
	
}
			
