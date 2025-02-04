package student.profile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import student.profile.db.DB;

public class AddActions {

//	Adding into database
	public boolean add(StudentProfile sp)
	{
		boolean check = false;
		try 
		{
			Connection con = DB.getCon();
			String query = "insert into profile(name,domain,address) value(?,?,?)";
			
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, sp.getName());
			statement.setString(2, sp.getDomain());
			statement.setString(3, sp.getAddress());
			statement.executeUpdate();
			
			check = true;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return check;
	}
	
//	Displaying all the data
	
	public void display()
	{
		Connection con = DB.getCon();
		String query = "select * from profile";
		try 
		{
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println(
				
						"ID " + rs.getInt(1) +
						"\nName "+ rs.getString(2) +
						"\nDomain "+ rs.getString(3)+
						"\nAddress "+ rs.getString(4)
				);
				System.out.println("======================================");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
//	Displaying by ID
	
	public boolean displayById(int id)
	{
		boolean check = false;
		
		Connection con = DB.getCon();
		String query = "select * from profile where id= "+id;
		try 
		{
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println(
				
						"ID: "+rs.getInt(1)+"\n"+
						"Name: "+rs.getString(2)+"\n"+
						"Domain: "+rs.getString(3)+"\n"+
						"Address: "+rs.getString(4)+"\n"
				);
				System.out.println("=======================");
			}
			check = true;
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
		return check;
	}
	
//	 Delete by Id
	
	public boolean deleteById(int id)
	{
		boolean check = false;
		
		Connection con = DB.getCon();
		String query = "delete from profile where id= "+id;
		try 
		{
			PreparedStatement ps = con.prepareStatement(query);
			ps.executeUpdate();
			check = true;
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
			
		return check;
	}
	
//	Update records
	
	public boolean updateDetails(int id, String newInput, int number, StudentProfile sp)
	{
		boolean check = false;
		try 
		{
			if(number == 1)
			{
				Connection con = DB.getCon();
				String query = "update profile set domain=? where id=?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, newInput);
				ps.setInt(2, id);
				ps.executeUpdate();	
				
				check = true;
			}
			
			if(number == 2)
			{
				Connection con = DB.getCon();
				String query = "update profile set address=? where id=?";
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, newInput);
				ps.setInt(2, id);
				ps.executeUpdate();	
				
				check = true;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		return check;
	}
	
}
