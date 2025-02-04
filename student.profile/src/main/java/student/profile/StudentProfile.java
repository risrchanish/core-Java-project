package student.profile;

import java.util.Scanner;

public class StudentProfile {

	private int id;
	private String name;
	private String domain;
	private String address;
	
	
//	constructors
	
	public StudentProfile() {
		
	}
	public StudentProfile(int id, String name, String domain, String address) {
		
		this.id = id;
		this.name = name;
		this.domain = domain;
		this.address = address;
	}
	
	public StudentProfile(String name, String domain, String address) {

		this.name = name;
		this.domain = domain;
		this.address = address;
	}
	
//	getters setters
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getDomain()
	{
		return domain;
	}
	
	public void setDomain(String domain)
	{
		this.domain = domain;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	
//	 To String
	
	public String toString()
	{
		return "Student Id:" + id + "\nStudent Name: "+name+"\nStudent domain: "+domain+"\nStudent Address: "+address;
	}
	
//	 Main method
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The Student Profile Portal");
		AddActions ad = new AddActions();
		
		while(true)
		{
			System.out.println(
					
					"press 1 for Adding Profile \n" +
					"press 2 for displaying Profiles \n" +
					"press 3 for Displaying Profile with ID \n"+
					"press 4 for Deleting profile \n" +
					"press 5 for Updating Profile \n" + 
					"press 6 for Exiting from the portal \n"		
			);
			
			System.out.println("Please provide your input -");
			
			int input = sc.nextInt();
			
				
			switch(input)
			{
				case 1:
					System.out.println("Add Profile");
					System.out.println("Enter Name");
					String name = sc.next();
					System.out.println("Enter Domain");
					String domain = sc.next();
					System.out.println("Enter Address");
					String address = sc.next();
					
					StudentProfile sp = new StudentProfile(name,domain,address);
					
					boolean valid = ad.add(sp);
					
					if(valid == true)
					{
						System.out.println("\nprofile has been added\n");
					}
					else
					{
						System.out.println("\nProblem occured\n");
					}
					
					break;
				
				case 2:
					System.out.println("Display: \n");
					ad.display();	
					
					break;
				
				case 3:
					System.out.println("Display by Id\n");
					System.out.println("Enter ID:");
					int id = sc.nextInt();
					
					boolean validId = ad.displayById(id);
					if(validId == false)
					{
						System.out.println("Profile with this id is not present");
					}
					
					break;
				
				case 4:
					System.out.println("Delete\n");
					System.out.println("Enter Id to delete the profile");
					int deleteId = sc.nextInt();
					
					boolean deletedResult = ad.deleteById(deleteId);
					if(deletedResult == false)
					{
						System.out.println("This Id is not present in profile to delete");
					}
					else
					{
						System.out.println("Deleted");
					}
					
					break;
				
				case 5:
					System.out.println("Update");
					
					System.out.println(
							"Press 1 to update Domain \n"+
							"Press 2 to update Address \n"
					);
					
					int update = sc.nextInt();
					if(update == 1)
					{
						System.out.println("Enter id of a profile to update the deomain");
						int intDomain = sc.nextInt();
						
						System.out.println("Enter new domain ");
						String setDom = sc.next();
						StudentProfile spp = new StudentProfile();
						spp.setDomain(setDom);
						
						boolean updateRecord = ad.updateDetails(intDomain, setDom, update, spp);
						
						if(updateRecord == true)
						{
							System.out.println("Domain updated");
						}
						else
						{
							System.out.println("Records did not update");
						}
					}
					else if(update == 2)
					{
						
						System.out.println("Enter id of a profile to update the address");
						int intDomain = sc.nextInt();
							
						System.out.println("Enter new address ");
						String setAddr = sc.next();
						StudentProfile spp = new StudentProfile();
						spp.setAddress(setAddr);
							
						boolean updateRecord = ad.updateDetails(intDomain, setAddr, update, spp);
							
						if(updateRecord == true)
						{
							System.out.println("Address updated");
						}
						else
						{
							System.out.println("Records did not update");
						}
						
					}
					
					
					break;
				
				case 6:
					System.out.println("Exit");
					System.exit(0);
					break;
				
				default:
					System.out.println("Invalid");
					
			}
		}

	}
	
	

}
