package sef.ATestTask.FirstActivity;


//TODO Implement class Student with parent Person

public class Student extends Person {
	//Attributes

	private String schoolName;
	private int yearEnrolled;
	
	
    public Student(){
    	this.schoolName = "Unknown";
    	this.yearEnrolled = 0;
    }
	public Student(String firstName, String secondName, int age, String schoolName, int yearEnrolled){
		super(firstName, secondName, age);
		this.schoolName = schoolName;
		this.yearEnrolled = yearEnrolled;
	}
	
	public String getschoolName() {
		return schoolName;
	}
	public void setschoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public int getyearEnrolled() {
		return yearEnrolled;
	}
	public void setyearEnrolled(int yearEnrolled) {
		this.yearEnrolled = yearEnrolled;
	}
	
	public String announce() {
		return "I am " + getFirstName() + " " + getSecondName() + " and I am studying at " + getschoolName() + " .";
	}
	public  void introduce() {
		System.out.println("I am " + getFirstName() + " " + getSecondName() + " and I am studying at " + getschoolName() + " .");
	}
	
}
