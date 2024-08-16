package exception;
import java.util.*;
class InvalidAgeException extends RuntimeException{    //create user defined Exception class and implement all the required method 
	public InvalidAgeException(String message) {
		super(message);
		
	}
}

public class Assignment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
			checkAge(age);
			
		} catch (Exception e) {
			System.out.println("Invalid age exception:"+e.getMessage());
		}
      
	}
	 private static void checkAge(int age) {
		 if(age<14 || age>18) {
			 throw new InvalidAgeException("Age is not between 14 and 17 for the admission");
			 
		 }
		 else {
			 System.out.println("Eligible for admission");
		 }
		
	}

}
