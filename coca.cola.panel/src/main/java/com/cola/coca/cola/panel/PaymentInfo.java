package com.cola.coca.cola.panel;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@Entity
@ToString
@Getter
@Setter
@Table(name = "User_Info")
public class PaymentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long m_id;

    public String accountNumber;
    public String cvv;
    public String paymentMethodType;
    public String cardNumber;
    public String date;
    public String cardName;
    public String email;
    public String phone;

}
