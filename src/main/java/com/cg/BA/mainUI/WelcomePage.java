package com.cg.BA.mainUI;

import java.util.Scanner;

import com.cg.BA.bean.CustomerDetails;
import com.cg.BA.bean1.TransactionDetails;
import com.cg.BA.dao.Registration;
import com.cg.BA.daoImpl.CRUDE_Operations;
import com.cg.BA.daoImpl.RegistrationImpl ;
import com.cg.BA.service.Iservice;
import com.cg.BA.service.ServiceImpl;

public class WelcomePage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		TransactionDetails td = new TransactionDetails(0,0,0,0,0);
		CustomerDetails cd = new CustomerDetails(0,null, null, null, null, 0, null, 0,null, 0, 0);
		Iservice s= new ServiceImpl();
		
		System.out.println("Enter your choice");
		System.out.println("1.Registration");
		System.out.println("2.Login");
		
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			System.out.println("Enter firstname");
			cd.setFirst_Name(sc.next());
			System.out.println("Enter lastname");
			cd.setLast_Name(sc.next());
			System.out.println("Enter accounttype");
			cd.setAccount_Type(sc.next());
			System.out.println("Enter Email");
			cd.setEmail_Id(sc.next());
			System.out.println("Enter Pancard number");
			cd.setPancard_No(sc.next());
			System.out.println("Enter aadharcard number");
			cd.setAadhaar_No(sc.nextLong());
			System.out.println("Enter your address");
			cd.setAddress(sc.next());
			System.out.println("Enter your mobile number");
			cd.setMobile_No(sc.nextLong());
			
			s.createAccount();
			
			System.out.println("Your account if created succesfully");
			System.out.println("Your account number is:" );
			System.out.println("Your password is" );
			
			
			break;
			
		case 2:
			System.out.println("Enter your Account number");
			long account_No=sc.nextLong();
			System.out.println("Enter your Password");
			String password=sc.next();
			
			System.out.println("Enter your choice");
			System.out.println("1.Withdrawal");
			System.out.println("2.Deposite");
			System.out.println("3.Balance Enquiry");
			System.out.println("4.Transaction");
			System.out.println("5.Exit");
			
			int ch1 = sc.nextInt();
			
			CRUDE_Operations c= new CRUDE_Operations();
			
			switch (ch) {
			case 1:
				System.out.println("Enter Amount");
				td.setAmount(sc.nextLong());
				c.withdrawal();
				
				break;
			case 2:
				System.out.println("Enter amount");
				td.setAmount(sc.nextLong());
				c.deposite();
				
				break;
			case 3:
				c.balanceEnquiry();
	
				break;
			case 4:
				c.transaction();
	
				break;
			case 5:
				System.out.println("Thank You");
				
				break;

			default:
				System.out.println("Enter valid input");
				break;
			}
		
			
			
			
			break;

		default:
			
			System.out.println("Enter valid choice");
			break;
		}

	}

	
}
