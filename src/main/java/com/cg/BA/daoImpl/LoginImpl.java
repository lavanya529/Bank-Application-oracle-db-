package com.cg.BA.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


import com.cg.BA.bean.CustomerDetails;
import com.cg.BA.bean1.TransactionDetails;
import com.cg.BA.dao.Login;

public class LoginImpl implements Login{

	public long login(CustomerDetails customer) {
		
		Scanner sc = new Scanner(System.in);
		TransactionDetails td = new TransactionDetails(0,0,0,0,0);
		CustomerDetails cd = new CustomerDetails(0,null, null, null, null, 0, null, 0,null, 0, 0);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","oracle");
			Statement st = connection.createStatement();
			
			ResultSet resultSet = st.executeQuery("select * from customerDetails");
			
			
			
			
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return 0;
	}
}
	

	

