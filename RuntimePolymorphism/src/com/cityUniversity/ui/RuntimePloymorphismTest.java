package com.cityUniversity.ui;
import com.cityUniversity.model.CashPayment;
import com.cityUniversity.model.Payment;

public class RuntimePloymorphismTest {

	public static void main(String[] args) {
		Payment p = new CashPayment();
		p.payment(200);
	}

}
