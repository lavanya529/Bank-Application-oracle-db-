package com.cg.BA.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import com.cg.BA.bean.CustomerDetails;
import com.cg.BA.dao.Registration;

public class RegistrationImpl implements Registration {

	public long createAccount(long account_No, String password) {
		
		CustomerDetails cd = new CustomerDetails(0,null, null, null, null, 0, null, 0,null, 0, 0);
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","oracle");
			
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into customerDetails values(?,?,?,?,?,?,?,?,?,?,?)");

			

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
