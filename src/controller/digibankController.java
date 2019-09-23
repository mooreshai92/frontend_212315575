package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Transaction;
import model.TransactionEntity;
import service.TransactionEJB;

@ManagedBean(name="digibankcontroller")
@SessionScoped
public class digibankController {
	
	@EJB
	TransactionEJB transactionservice;
	
	@ManagedProperty(value="#{transaction}")
	private Transaction transaction;

	
	public void addtransaction()
	{
		System.out.println("Is in use");
		
		transactionservice.addNew(transaction.getEntity());
	}

	public Transaction getTransaction() {
		return transaction;
		
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	
	
}
