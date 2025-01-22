package emailapp;
import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		Email email = new Email();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		email.setFirstname(sc.next());
		System.out.println("Enter your last name");
		email.setLastname(sc.next());
		System.out.println("Enter your department from \nsales \ndevelopment \naccounting");
		email.setDepartment(sc.next());
		System.out.println("Enter your company name");
		email.setCompany(sc.next());
		
		System.out.println("Your email address is: "+email.getFname() + "." + email.getLname() + "@"+email.getDepartment()+email.getcompany()+".com");
		
		
		System.out.println("Enter a number to generate password for your email");
		
			email.generateRandomPassword(sc.nextInt());
			System.out.println("Your password is: " +email.getPassword());
		
			sc.close();
		

	}

}
