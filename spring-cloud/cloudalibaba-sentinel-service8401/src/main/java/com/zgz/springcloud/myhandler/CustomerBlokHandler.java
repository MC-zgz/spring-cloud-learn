package com.zgz.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.zgz.springcloud.entities.CommonResult;

public class CustomerBlokHandler {
    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义exception-------1");
    }
    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义exception-------2");
    }
}
