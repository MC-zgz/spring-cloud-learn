package com.zgz.springcloud.service.Impl;

import com.zgz.springcloud.mapper.OrderMapper;
import com.zgz.springcloud.pojo.Order;
import com.zgz.springcloud.service.AccountService;
import com.zgz.springcloud.service.OrderService;
import com.zgz.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private AccountService accountService;
    @Resource
    private StorageService storageService;

    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        //新建订单
        log.info("------>开始创建新订单");
        orderMapper.create(order);
        log.info("------>创建新订单end");
        //扣减库存
        log.info("----->订单微服务开始调用库存，做扣减");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("----->订单微服务调用库存做扣减end");
        //扣减账户
        log.info("------>订单微服务开始调用账户，做扣减");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("------>订单微服务调用账户做扣减end");
        //修改订单状态
        log.info("----->修改订单状态开始");
        orderMapper.update(order.getUserId(),0);
        log.info("----->修改订单状态end");

        log.info("下单结束O(∩_∩)O哈哈~");
    }
}
