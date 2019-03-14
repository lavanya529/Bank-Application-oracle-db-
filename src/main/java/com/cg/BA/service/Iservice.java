package com.cg.BA.service;

import com.cg.BA.bean.CustomerDetails;

public interface Iservice {
	
	public long createAccount(long account_No,String password);
	public long login(CustomerDetails customer);
	

}
