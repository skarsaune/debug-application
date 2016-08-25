package com.example.domain;

import java.math.BigDecimal;
import java.util.Currency;

public class Account {
	private MonetaryAmount balance=new MonetaryAmount(Currency.getInstance("NOK"), BigDecimal.ZERO);
	private final Bank bank;

	public Account(Bank bank) {
		this.bank = bank;
	}

	public MonetaryAmount getBalance() {
		return balance;
	}

	public void deposit(final MonetaryAmount deposit) {
		this.bank.deposit(this, deposit);
	}

	public void withdraw(MonetaryAmount withdrawal) {
		deposit(withdrawal.negate());
		
	}

	void setAmount(MonetaryAmount add) {
		this.balance=add;
	}

	public String toString() {
		return "Balance: " + this.balance;
	}
}
