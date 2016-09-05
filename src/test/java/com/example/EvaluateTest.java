package com.example;

import java.math.BigDecimal;
import java.util.Currency;

import org.junit.Test;

import com.example.domain.Bank;
import com.example.domain.Customer;
import com.example.domain.MonetaryAmount;

public class EvaluateTest {

	private Bank bank = new Bank();

	@Test
    public void evaluateStuff() {
    	Double factor = 1.0;
    	Double result = Math.max(factor * 2.0 , factor * -2.0);

        Customer creditor = new Customer();
		bank.openAccount(creditor);
		if(creditor.getAccount().getBalance().getAmount().compareTo(BigDecimal.ZERO) >= 0) {
			System.out.println("phew");
		} else {
			System.out.println("uh oh");
		}
		Customer debitor=new Customer();
        bank.openAccount(debitor);
        MonetaryAmount amount=new MonetaryAmount(Currency.getInstance("NOK"), new BigDecimal(100).setScale(2));
        bank.transfer(debitor, creditor, amount);
    	
    	
    	
    	
    }

}
