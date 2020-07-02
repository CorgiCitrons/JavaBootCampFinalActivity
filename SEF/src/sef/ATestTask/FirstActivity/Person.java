package sef.ATestTask.FirstActivity;

public class Person {	

//TODO 1 Implement Person Attributes
	
	public String firstName;
	public String secondName;
	private int age;	

	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) throws CustomExceptionPerson {
		if (!firstName.matches("[a-zA-Z]+"))
		{
			throw new CustomExceptionPerson();
			}
		this.firstName = firstName;


	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) throws CustomExceptionPerson {
		if(!secondName.matches("[a-zA-Z]+")) {
			throw new CustomExceptionPerson();
			}
		this.secondName = secondName;
		}
	
	//Check first name Ivan3
//	public static void main(String arg[]){
//		try {
//			setFirstName("Ivan3");
//		} catch (CustomExceptionPerson c) {
//			System.out.println("Invalid input!");
//			System.out.println (c.getMessage());}		
//		}

	public String announce() {
		return "I am " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years young.";
	}
	public void introduce() {
		System.out.println("I am " + firstName + " " + secondName + " and i am " + age + " years young.");
	}
}

