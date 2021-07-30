package com.zgz.springcloud.mapper;

import com.zgz.springcloud.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    //新增订单
    void create(Order order);
    //修改订单状态
    void update(@Param("user_id") Long userId,@Param("status") Integer status);
}
