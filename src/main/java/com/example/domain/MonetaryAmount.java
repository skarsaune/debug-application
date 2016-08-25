package com.example.domain;

import java.math.BigDecimal;
import java.util.Currency;

import javax.validation.constraints.NotNull;

public class MonetaryAmount {
	private final BigDecimal amount;
	private final Currency currency;
	public MonetaryAmount(@NotNull Currency currency, @NotNull BigDecimal amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public MonetaryAmount add(final MonetaryAmount deposit) {
		
		return new MonetaryAmount(this.currency, this.amount.add(deposit.getAmount()));
	}
	
	public MonetaryAmount negate() {
		
		return new MonetaryAmount(this.currency, this.amount.negate());
	}
	
	public MonetaryAmount subtract(final MonetaryAmount withdrawal) {
		return add(withdrawal.negate());
	}
	

	public String toString() {
		return this.amount + " " + this.currency;
	}

}
