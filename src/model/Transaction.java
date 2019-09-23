package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "transaction")
@SessionScoped 
public class Transaction {
	
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destinationCountry;
	private String accountNumber;
	private String amount;
	private String transactionCode;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	
	public TransactionEntity getEntity()
	{
		TransactionEntity transactionentity =  new TransactionEntity();
		
		transactionentity.setName(name);
		transactionentity.setSourcePassport(sourcePassport);
		transactionentity.setDestinationPassport(destinationPassport);
		transactionentity.setDestinationBank(destinationBank);
		transactionentity.setDestinationCountry(destinationCountry);
		transactionentity.setAccountNumber(accountNumber);
		transactionentity.setAmount(amount);
		transactionentity.setTransactionCode(transactionCode);
		
		return transactionentity; 
		
		
	}
	

}
