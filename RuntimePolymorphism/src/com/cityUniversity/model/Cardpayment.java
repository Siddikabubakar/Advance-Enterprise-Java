package com.cityUniversity.model;

public class Cardpayment implements Payment {

	@Override
	public void payment(double amount) {
		
		System.out.println("Pay by Card amount "+amount);

	}

}
