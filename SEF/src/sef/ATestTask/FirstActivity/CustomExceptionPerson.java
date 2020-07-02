package sef.ATestTask.FirstActivity;

public class CustomExceptionPerson extends Exception {
	public String getMessage() {
		String msg = "You can not input information with numbers and symbols!";
		return msg;
	}

}
