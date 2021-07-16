package com.zgz.springcloud.controller;

import com.zgz.springcloud.entities.CommonResult;
import com.zgz.springcloud.entities.Payment;
import com.zgz.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果" + result);
        if(result > 0){
            return new CommonResult(200,"插入成功！" + serverPort,result);
        }else {
            return new CommonResult(404,"插入失败！",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果" + payment+"^_^");
        if(payment != null){
            return new CommonResult(200,"查询成功！" + serverPort,payment);
        }else {
            return new CommonResult(404,"没有对应记录！",null);
        }
    }
}
