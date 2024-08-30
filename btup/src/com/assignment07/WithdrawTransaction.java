package com.assignment07;


public class WithdrawTransaction extends Security implements Runnable {

	private int transactionId;
	public int getTransactionId() {
		return transactionId;
	}

	public WithdrawTransaction(int transactionId, Customer customer, Account account, double amount) {
		super();
		this.transactionId = transactionId;
		this.customer = customer;
		this.account = account;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "WithdrawTransaction [transactionId=" + transactionId + ", customer=" + customer + ", account=" + account
				+ ", amount=" + amount + "]";
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	private Customer customer;
	private Account account;
	private double amount;
	
	public synchronized double withdraw(Account acc, double amt) throws InsufficientBalanceException {
		if(acc.getBalance() < amt)
			throw new InsufficientBalanceException();
		acc.setBalance(acc.getBalance()-amt);
		return acc.getBalance();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			authorization(account, customer);
			double balance = withdraw(account, amount);
			
			System.out.println(transactionId+" transaction is complete and the balance is "+balance);
			
		} catch (UnauthorizedWithdrawTransactionException e) {
			System.out.println(transactionId+" transaction failed and "+e.getMessage());
		} catch (InsufficientBalanceException e) {
			System.out.println(transactionId+" transaction failed and "+e.getMessage());
		}
		
	}
	
}
