package com.example.domain;

import java.math.BigDecimal;
import java.util.Currency;

public class Bank {
	
	public void transfer(final Customer from, final Customer to, final MonetaryAmount amount) {
		from.getAccount().withdraw(amount);
		to.getAccount().deposit(amount);
	}

	public void openAccount(final Customer customer) {
		customer.setAccount(new Account(this));
	}

	public void deposit(final Account account, final MonetaryAmount deposit) {
		account.setAmount(account.getBalance().add(convert(deposit, account.getBalance().getCurrency())));
		
	}
	
	private MonetaryAmount convert(MonetaryAmount deposit, Currency currency) {
		return new MonetaryAmount(currency, deposit.getAmount().multiply(rate(deposit.getCurrency(), currency)));
	}


	private BigDecimal rate(final Currency from, final Currency to) {
		return BigDecimal.ONE;
	}

}
