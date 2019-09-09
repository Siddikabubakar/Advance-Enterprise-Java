package com.cityu.test;

import com.cityu.Payment;

public class CompileTimePolymorphismTest {

	public static void main(String[] args) {
		
		Payment pay = new Payment();
		pay.showPayment();
		
		pay.showPayment(123);
	}

}
