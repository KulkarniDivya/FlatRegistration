package com.cg.frs.utility;

public class WrongDepositAmountException extends Exception {
	public WrongDepositAmountException()
	{
		System.out.println("Deposit Amount should be more than rent amount");
	}
}
