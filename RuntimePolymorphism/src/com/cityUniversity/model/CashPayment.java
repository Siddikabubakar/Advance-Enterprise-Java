package com.cityUniversity.model;

public class CashPayment implements Payment {

	@Override
	public void payment(double amount) {
		System.out.println("Pay by cash"+amount);
	}

}
