package com.graeme.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.graeme.model.loginStore;

public class loginBean 
{
	private List<loginStore> login = new ArrayList<loginStore>();
	ResultSet rs;
	
	public List<loginStore> userVerify() {
		try {
				try 
				{
					Class.forName("org.gjt.mm.mysql.Driver");
				} 
				catch (Exception E) 
				{
					System.out.println("First: " + E);
				}

				Connection MyCon = null;

				try
				{
					MyCon = DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk:3306/graemebrown","graemebrown", "acb123");
					Statement st = MyCon.createStatement();
					rs = st.executeQuery("SELECT * FROM users");
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}

				//System.out.println("LoginBean still working!");

			
				try 
				{

					//System.out.println("Attempting to select all from users");

					if (rs == null) {
						System.out.println("Result Set is empty!!");
						MyCon.close();
						return null;

				}
				//System.out.println("Starting While loop!");
				while (rs.next()) {
					loginStore user = new loginStore();
					user.setEmail(rs.getString("email"));
					user.setPasword(rs.getString("pasword"));
					user.setAccess_Type(rs.getString("access_Type"));
				//	System.out.println("While loop in login bean has data...." + user.getEmail());
					login.add(user);
				}

				rs.close();
				MyCon.close();

			} catch (Exception ex) {

				System.out.println("Not working");

			}

		} catch (Exception E) {
			System.out.println("Can't execute query: " + E);
		}
		//System.out.println("logingbean complete");
		
		return login;

	}

}
