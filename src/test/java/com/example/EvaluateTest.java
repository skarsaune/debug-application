package com.example;

import java.math.BigDecimal;

import org.junit.Test;

import com.example.domain.Bank;
import com.example.domain.Customer;

public class EvaluateTest {

	private Bank bank = new Bank();

	@SuppressWarnings("unused")
	@Test
    public void evaluateStuff() {
    	Double factor = 1.0;
    	Double result = Math.max(factor * 2.0 , factor * -2.0);

        Customer debitor = new Customer();
		bank.openAccount(debitor);
		if(debitor.getAccount().getBalance().getAmount().compareTo(BigDecimal.ZERO) >= 0) {
			System.out.println("phew");
		} else {
			System.out.println("uh oh");
		}

    }

}
