package sef.ATestTask.FirstActivity;

public class Person {	

//TODO 1 Implement Person Attributes
	
	public String firstName;
	public String secondName;
	private int age;	

	//Behavior - default constructor
	public Person(){
		this.firstName="Unknown";
		this.secondName = "Unknown";
		this.age = 0;
	}

	//Behavior - parameterized constructor
	public Person(String firstName, String secondName, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	// getter for String firstName
	
	//In class Person add check when set firstName and secondName, check no numbers there. ->
	
	//setName("Ivan3") should throw the customized exception
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) throws CustomExceptionPerson {
		try {
			if (!firstName.matches("^[a-zA-Z]+$")) {
				throw new CustomExceptionPerson();
			}
		} catch (CustomExceptionPerson e) {
			System.out.println("Name contain number");
		}
		this.firstName = firstName;
	}
//	public void setFirstName(String firstName) throws CustomExceptionPerson{
//		try
//		{
//			if(firstName.matches("[a-zA-Z]+")) {
//				throw new CustomExceptionPerson("Invalid entry. First name contains number");}
//		}catch (CustomExceptionPerson e) {
//			System.out.println("Invalid entry. First name contains number");
//
//			}
//		this.firstName = firstName;
//	}

	// getter for int age
	public int getAge() {
		return age;
	}

	// setter for int age
	public void setAge(int age) {
		this.age = age;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		try {
			if(!secondName.matches("[a-zA-Z]+")) {
				throw new CustomExceptionPerson("Invalid entry. Second name contains number");
			}
		} catch (CustomExceptionPerson e1) {
			System.out.println("Invalid entry. Second name contains number");
		}
		this.secondName = secondName;
		
		
		if (y==0) {
			throw new ArithmeticException("Argument 'divisor' is 0. Can not delete"); 
		} else {
		return x / y;
		
	}

	//TODO 2 add all person info into announce() method
	public String announce() {
		return "I am " + getFirstName() + " " + getSecondName() + " and i am " + getAge() + " years young.";
	}
	public void introduce() {
		System.out.println("I am " + firstName + " " + secondName + " and i am " + age + " years young.");
	}
}

