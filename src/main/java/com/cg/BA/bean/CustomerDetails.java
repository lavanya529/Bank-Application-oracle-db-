package com.cg.BA.bean;

public class CustomerDetails {
	
	private long account_No;
	private String account_Type;
	private String first_Name;
	private String last_Name;
	private String email_Id;
	private int password;
	private String pancard_No;
	private long aadhaar_No;
	private String address;
	private long mobile_No;
	private long balance;
	
	public CustomerDetails(long account_No,String account_Type, String first_Name,String last_Name,String email_Id, int password,String pancard_No,
			long aadhaar_No,String address,long mobile_No,long balance) {
		
		this.account_No=account_No;
		this.account_Type=account_Type;
		this.first_Name=first_Name;
		this.last_Name=last_Name;
		this.email_Id=email_Id;
		this.password=password;
		this.pancard_No=pancard_No;
		this.aadhaar_No=aadhaar_No;
		this.address=address;
		this.mobile_No=mobile_No;
		this.balance=balance;
	
	}
	
	

	public String getAccount_Type() {
		return account_Type;
	}



	public void setAccount_Type(String account_Type) {
		this.account_Type = account_Type;
	}



	public long getAccount_No() {
		return account_No;
	}

	public void setAccount_No(long account_No) {
		this.account_No = account_No;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getPancard_No() {
		return pancard_No;
	}

	public void setPancard_No(String pancard_No) {
		this.pancard_No = pancard_No;
	}

	public long getAadhaar_No() {
		return aadhaar_No;
	}

	public void setAadhaar_No(long aadhaar_No) {
		this.aadhaar_No = aadhaar_No;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobile_No() {
		return mobile_No;
	}

	public void setMobile_No(long mobile_No) {
		this.mobile_No = mobile_No;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}
