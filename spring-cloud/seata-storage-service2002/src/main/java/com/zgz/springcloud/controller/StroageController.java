package com.zgz.springcloud.controller;

import com.zgz.springcloud.entities.CommonResult;
import com.zgz.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class StroageController {

    @Resource
    private StorageService storageService;
    @PostMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") long productId,
                                 @RequestParam("count") Integer count){
        storageService.decrease(productId,count);
        return new CommonResult(200,"扣减库存成功");
    }

}
