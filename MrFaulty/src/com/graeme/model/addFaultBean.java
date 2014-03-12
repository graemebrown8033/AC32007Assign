package com.graeme.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.util.*;
import java.sql.*;

import com.graeme.model.storeBean;

public class addFaultBean 
{

private List<storeBean> storeList = new ArrayList<storeBean>();
	
	public void setData(String short_Desc, String description, String priority, int reported_By)
	{
		try{
		     Class.forName("org.gjt.mm.mysql.Driver");
		}catch(Exception E){
		     System.out.println("First: " + E);
		}
		Connection MyConnection=null;
		
		try {
			MyConnection= DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk:3306/graemebrown","graemebrown","acb123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		PreparedStatement pmst=null;
		System.out.println("Still working!");
		
		
		String query= "INSERT INTO graemebrown.fault(short_Desc, description, priority, reported_By ) VALUES (?,?,?,?)";
		try {
				System.out.println("Attempting to build query");
				pmst = MyConnection.prepareStatement(query);
				pmst.setString(1,short_Desc);
				pmst.setString(2,description);
				pmst.setString(3,priority);
				pmst.setInt(4,reported_By);
				pmst.executeUpdate();
				
				

				
				//pmst.executeUpdate();
		}catch(Exception ex){
			
			System.out.println("Not working");
			return; }

		
		try {
			MyConnection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
}
