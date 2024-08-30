package com.assignment08;


public class LoanTransaction implements Runnable {
	
	private BankFund bankfund;
	private int customerId;
	private double loanAmount;
	
	public LoanTransaction(BankFund bankfund, int customerId, double loanAmount) {
		super();
		this.bankfund = bankfund;
		this.customerId = customerId;
		this.loanAmount = loanAmount;
	}

	public void run() {
		try {
			bankfund.checkFund(loanAmount);
			Thread.sleep((long)(2000*Math.random()));
			
			double fundAvailable = bankfund.debitFund(loanAmount);
			System.out.println(customerId+" the loan is disbursed! Pl collect the cash from the teller");
			System.out.println("Fund left in the bank - "+fundAvailable);
			
		}catch(InsufficientFundException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}