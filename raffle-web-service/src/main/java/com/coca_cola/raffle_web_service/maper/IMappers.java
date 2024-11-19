package com.coca_cola.raffle_web_service.maper;

import com.coca_cola.raffle_web_service.PaymentInfoDto;
import com.cola.coca.cola.panel.PaymentInfo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


@Mapper(implementationName = "PaymentsImpl",componentModel = "spring")
public interface IMappers {

    PaymentInfo payments(PaymentInfoDto dto);
    PaymentInfoDto paymentDto(PaymentInfo paymentInfo);
}
