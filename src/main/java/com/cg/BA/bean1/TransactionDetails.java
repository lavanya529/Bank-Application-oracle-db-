package com.cg.BA.bean1;

public class TransactionDetails {
	
	private int tansaction_Id;
	private long amount;
	private long from_Account;
	private long to_Account;
	private long ammount_Transferred;
	
	public TransactionDetails(int tansaction_Id,long amount,long from_Account,long to_Account,long ammount_Transferred) {
		
		this.amount=amount;
		this.tansaction_Id=tansaction_Id;
		this.from_Account=from_Account;
		this.to_Account=to_Account;
		this.ammount_Transferred=ammount_Transferred;
		
	}
	
	
	public long getAmount() {
		return amount;
	}


	public void setAmount(long amount) {
		this.amount = amount;
	}


	public int getTansaction_Id() {
		return tansaction_Id;
	}
	public void setTansaction_Id(int tansaction_Id) {
		this.tansaction_Id = tansaction_Id;
	}
	public long getFrom_Account() {
		return from_Account;
	}
	public void setFrom_Account(long from_Account) {
		this.from_Account = from_Account;
	}
	public long getTo_Account() {
		return to_Account;
	}
	public void setTo_Account(long to_Account) {
		this.to_Account = to_Account;
	}
	public long getAmmount_Transferred() {
		return ammount_Transferred;
	}
	public void setAmmount_Transferred(long ammount_Transferred) {
		this.ammount_Transferred = ammount_Transferred;
	}

}
