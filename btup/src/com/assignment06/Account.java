package com.assignment06;



public class Account {
	private int accountNo;
	private Customer customer;
	public Account(int accountNo, Customer customer, double balance) {
		super();
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", customer=" + customer + ", balance=" + balance + "]";
	}
	private double balance;
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
