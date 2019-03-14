package com.cg.BA.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cg.BA.bean.CustomerDetails;
import com.cg.BA.bean1.TransactionDetails;
import com.cg.BA.dao.Login;

public class CRUDE_Operations {
	
	Scanner sc = new Scanner(System.in);
	TransactionDetails td = new TransactionDetails(0,0,0,0,0);
	CustomerDetails cd = new CustomerDetails(0,null, null, null, null, 0, null, 0,null, 0, 0);
	LoginImpl login = new LoginImpl();
	public long withdrawal(){
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","oracle");
			Statement st = connection.createStatement();
			
			ResultSet resultSet = st.executeQuery("select * from customerDetails");
			long bal=0;
			while(resultSet.next())
			{
				if(login.getAmount()<bal)
				{
					bal = bal - Amount;
					
					return bal;
				}
				else
				{
					System.out.println("low balance");
				}
				
				PreparedStatement preparedStatement = connection.prepareStatement("update customerDetails set balance=? where accountNo=?");
				
				preparedStatement.setLong(1, bal);
				preparedStatement.setLong(2, cd.getAccount_No());
				
				
				 int i = preparedStatement.executeUpdate();
				 
				 if (i==1) {
						System.out.println("done");
					} else {
			          System.out.println("error");
					}
						
					connection.close();
			}
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	public long deposite() {
		long bal=0;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","oracle");
			Statement st = connection.createStatement();
			
			ResultSet resultSet = st.executeQuery("select * from customerDetails");
			
			
			
			
			
			bal = bal +Amount;
			
			
			
			PreparedStatement preparedStatement = connection.prepareStatement("update customerDetails set balance=? where accountNo=?");
			
			preparedStatement.setLong(1, bal);
			preparedStatement.setLong(2, cd.getAccount_No());
			int i = preparedStatement.executeUpdate();
			
			if (i==1) {
				System.out.println("Money added");
			} else {
	          System.out.println("Error");
			}
			connection.close();
			
			
	
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bal;
		
		
	}

	public void balanceEnquiry() {
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

		
	}
	
	public void transaction() {
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
		
		
		
		
	}

	
}
