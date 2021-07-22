package com.zgz.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_ok(Integer id) {
        return "PaymentHystrixService fall back- paymentInfo_ok,o(╥﹏╥)o~";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "PaymentHystrixService fall back-paymentInfo_timeout,o(╥﹏╥)o";
    }
}
