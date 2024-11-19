package com.cola.coca.cola.panel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IPayment extends CrudRepository<PaymentInfo,Long> {

    List<PaymentInfo> findByPhone(@Param(value = "phone")String phone);

}
