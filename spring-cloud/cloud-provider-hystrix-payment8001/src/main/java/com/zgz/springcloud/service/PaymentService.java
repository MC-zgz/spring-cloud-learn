package com.zgz.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    /**
     * 正常访问
     * @param id
     * @return
     */
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_OK,id:"+id+"\t"+"O(∩_∩)O哈哈~";
    }

    /**
     * 报错
     * @param id
     * @return
     */
    public String paymentInfo_Timeout(Integer id){

        int timeNum = 3;

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+"paymentInfo_Timeout,id:"+id+"\t"+"O(∩_∩)O哈哈~"+"耗时(s)"+timeNum;
    }
}
