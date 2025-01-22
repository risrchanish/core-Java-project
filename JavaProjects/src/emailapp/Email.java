package emailapp;


public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String company;
	private String password;
	private int emailCapacity;
	private String alternateEmail;
		
	
	public void setFirstname(String fName)
	{
		firstName = fName;
	}
	
	public String getFname()
	{
		return firstName;
	}
	
	public void setLastname(String lName)
	{
		lastName = lName;
	}
	
	public String getLname()
	{
		return lastName;
	}
	
	//	 setting department
	
	public void setDepartment(String dept)
	{
		if(dept.equalsIgnoreCase("sales") || dept.equalsIgnoreCase("development") || dept.equalsIgnoreCase("accounting"))
		{
			department = dept + ".";
		}
		
		else
		{
			department = "";
		}
	}
	
	//	 Setting company
	
	public void setCompany(String comp)
	{
		company = comp;
	}
	
	
	public String getcompany()
	{
		return company;
	}
	
	
	//	setting department
	public String getDepartment()
	{
		
		return department;
	}
	
	
	//	setting email capacity
	public void setEmailCapacity(int emailCap)
	{
		emailCapacity = emailCap;
	}
	
	public int getEmailCapacity()
	{
		return emailCapacity;
	}
	
	//	 Generating password
	
	public void generateRandomPassword(int length)
	{
		String random = "*%$#@!123abcdefGHIJKL007MnopqRsTuVWXyz123456789!@#$*";
		char[] rPassword = new char[length];
		
		for(int i = 0; i < length; i++)
		{
			int randomNumber = (int)(Math.random() * random.length()); 
			rPassword[i] = random.charAt(randomNumber);
		}
		
		password =  new String(rPassword);
		
	}
	
	public String getPassword()
	{
		return password;
	}
	
	
	//	Setting alternate email
	
	public void setAlternateEmail(String alternate)
	{
		alternateEmail = alternate; 
	}
	
	public String getAlternateEmail()
	{
		return alternateEmail;
	}
	
	//	 change password
	
	public void changePassword(String newPassword)
	{
		password = newPassword;
	}
	
	public String getNewPassword()
	{
		return password;
	}
	
	
}
