package com.cola.coca.cola.panel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.TestPropertySource;


@SpringBootTest
@TestPropertySource("classpath:application.properties")

class PaymentHelperTests {

	@Autowired
	public PaymentHelper helper;
	@Test
	void Save() {
		var payment = new PaymentInfo();
		payment.setCvv("123");
		payment.setDate("12/34");
		payment.setEmail("karabey");
		payment.setPaymentMethodType("visa");
		payment.setPhone("55196420684");
		payment.setCardNumber("1234");
		payment.setAccountNumber("4321");
		payment.setCardName("fatih");
		Assertions.assertTrue(helper.save(payment));
		Assertions.assertNotNull(helper.findByPhone("55196420684"));
		Assertions.assertNotNull(helper.findAll());
	}

}