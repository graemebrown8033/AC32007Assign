package com.graeme.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;




import com.graeme.model.storeBean;

public class viewBean 
{
private static List<storeBean> storeList = new ArrayList<storeBean>();
	


	public static List<storeBean> getData() 
	{
		
		try{
		     Class.forName("org.gjt.mm.mysql.Driver");
		}catch(Exception E){
		     System.out.println("First: " + E);
		}
		Connection MyConnection=null;
		try {
		
			 MyConnection= DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk:3306/graemebrown","graemebrown","acb123");
		}catch(Exception E)
		{
		     System.out.println("Can't load driver: " + E);
		}	
		Statement st = null;
		ResultSet rs = null;
	
		try{
			
			 st = MyConnection.createStatement(); 
			 rs = st.executeQuery("Select * from fault");
		}catch(Exception E){
		     System.out.println("Can't execute query: " + E);
		}
		try{
		 System.out.println("Query ");
		 if (rs==null){
			 System.out.println("result set is empty ");
			 rs.close();
			MyConnection.close();
			return null;
		 }
		 		while(rs.next())
				{
		 			storeBean myBean = new storeBean();
		 			
		 			myBean.setFaultID(rs.getInt("faultID"));
		 			myBean.setShort_Desc(rs.getString("short_Desc"));
		 			myBean.setDescription(rs.getString("description"));
		 			myBean.setPriority(rs.getString("priority"));
		 			myBean.setReported_By(rs.getInt("reported_By"));
		 		
					 			
					
					storeList.add(myBean);
					System.out.println("model data"+ myBean.getFaultID());
					
				}
				
				rs.close();
			
				MyConnection.close();
				
		}
		catch(Exception E){
		     System.out.println("Can't iterate result set: " + E);
		}			 
		return storeList;
	
}
}
