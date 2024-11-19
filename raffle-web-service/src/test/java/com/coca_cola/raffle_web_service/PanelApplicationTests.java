package com.coca_cola.raffle_web_service;

import com.cola.coca.cola.panel.IPayment;
import com.cola.coca.cola.panel.PaymentInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PanelApplicationTests {

	@Autowired
	public IPayment user;
	@Test
	void contextLoads() {
		var payment = new PaymentInfo();
		payment.setCvv("123");
		payment.setDate("12/34");
		payment.setEmail("karabey");
		payment.setPaymentMethodType("visa");
		payment.setPhone("55196420684");
		payment.setCardNumber("1234");
		payment.setAccountNumber("4321");
		payment.setCardName("fatih");
		user.save(payment);
		Assertions.assertNotNull(user.findByPhone("55196420684"));
		Assertions.assertNotNull(user.findAll());
	}


}
