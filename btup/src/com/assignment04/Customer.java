package com.assignment04;

public class Customer {
	
	private int customerId;
	public int getCustomerId() {
		return customerId;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", loanAvailed=" + loanAvailed
				+ "]";
	}
	public Customer(int customerId, String customerName, boolean loanAvailed) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.loanAvailed = loanAvailed;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public boolean isLoanAvailed() {
		return loanAvailed;
	}
	public void setLoanAvailed(boolean loanAvailed) {
		this.loanAvailed = loanAvailed;
	}
	private String customerName;
	private boolean loanAvailed;
	
}