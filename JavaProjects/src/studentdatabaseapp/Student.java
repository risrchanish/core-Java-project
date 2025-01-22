package studentdatabaseapp;
import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private int year;
	private String courses = "";
	private static double cost = 600;
	private double balance;
	private double remainingBalance;
	private double totalCost =0;
	
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
//	public String getCourses()
//	{
//		return "";
//	}
	
	
	
	
//	public double getRemainingBalance()
//	{
//		
//	}
	
	public void studentInputStatus()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter details of the student below:\n");
		System.out.println("Enter first name: ");
		setFirstName(sc.next());
		System.out.println("Enter last name: ");
		setLastName(sc.next());
		System.out.println("Enter year: ");
		setYear(sc.nextInt());
		System.out.println("Enter balance: ");
		setBalance(sc.nextDouble());
	}
	
	public void courseEnroll()
	{
		System.out.println("Enter the number of courses to get enrolled into or Q to quit");
		do
		{
			
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if(!course.equalsIgnoreCase("Q"))
			{
				courses = courses +"\n"+ course;
				totalCost = totalCost + cost;
			}
			else
			{
				break;
			}
			
			
			
		}while(1 != 0);	
		
		System.out.println("Courses enrolled: "+courses);
		System.out.println("Total Cost: "+totalCost);
		System.out.println("Remaining Balance: "+ (getBalance() - totalCost));
		
	}
	
	public String generateUniqueId()
	{
		String str = "12345";
		char[] id = new char[5];
		for(int i = 0; i < 5; i++)
		{
			int random = (int)(Math.random() * str.length());
			id[i] = str.charAt(random);
		}
		
		return new String(id);
	}
	
	public void showInfo()
	{
		studentInputStatus();
		courseEnroll();
		
		System.out.println("First Name: "+getFirstName()+"\nLast name: "+getLastName()+"\nYear: "
	+getYear() +"\nUnique Id: "+generateUniqueId());
	}
	
}
