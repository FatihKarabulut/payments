package com.coca_cola.raffle_web_service;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode
@Getter
@Setter
public class PaymentInfoDto {
    public String accountNumber;
    public String cvv;
    public String paymentMethodType;
    public String cardNumber;
    public String date;
    public String cardName;
    public String email;
    public String phone;
}
