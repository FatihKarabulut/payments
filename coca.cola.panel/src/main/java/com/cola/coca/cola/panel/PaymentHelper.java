package com.cola.coca.cola.panel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.StreamSupport;

@Component
@Slf4j
public class PaymentHelper {

    public IPayment payments;

    public PaymentHelper(IPayment payments) {
        this.payments = payments;
    }

    public boolean save(PaymentInfo paymentInfo)
    {
        try {
            payments.save(paymentInfo);
            return true;
        }
        catch (Throwable ex)
        {
            log.error("PaymentHelper Save Exception {} ",ex.getMessage());
        }
        return false;
    }

    public List<PaymentInfo> findByPhone(String phone)
    {
        try {
            return payments.findByPhone(phone);
        }
        catch (Throwable ex)
        {
            log.error("PaymentHelper findByPhone Exception {} ",ex.getMessage());
        }
        return null;
    }
    public List<PaymentInfo> findAll()
    {
        try {
            return StreamSupport.stream(payments.findAll().spliterator(),false).toList();
        }
        catch (Throwable ex)
        {
            log.error("PaymentHelper findAll Exception {} ",ex.getMessage());
        }
        return null;
    }
}
