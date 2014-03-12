package com.graeme.model;

public class loginStore 
{
	private int userID;
	private String email;
	private String first_Name;
	private String last_Name;
	private String pasword;
	private String access_Type;
	
	public int getUserID() 
	{
		return userID;
	}
	
	public void setUserID(int userID)
	{
		this.userID = userID;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public void setEmail(String email) 
	{
		this.email = email;
	}
	
	public String getFirst_Name() 
	{
		return first_Name;
	}
	
	public void setFirst_Name(String first_Name)
	{
		this.first_Name = first_Name;
	}
	
	public String getLast_Name() 
	{
		return last_Name;
	}
	
	public void setLast_Name(String last_Name) 
	{
		this.last_Name = last_Name;
	}
	
	public String getPasword() 
	{
		return pasword;
	}
	
	public void setPasword(String pasword) 
	{
		this.pasword = pasword;
	}
	
	public String getAccess_Type()
	{
		return access_Type;
	}
	
	public void setAccess_Type(String access_Type)
	{
		this.access_Type = access_Type;
	}
	
	
}
