package com.assignment08;


public class BankFund {
	
	private double fund;
	
	public BankFund(double fund) {
		super();
		this.fund = fund;
	}

	public int checkFund(double amount) throws InsufficientFundException{
		if(fund<amount)
			throw new InsufficientFundException();
		return 0;
	}
	
	public double debitFund(double amount) {
		fund -= amount;
		return fund;
	}
}
