package com.zgz.springcloud.service.Impl;

import com.zgz.springcloud.mapper.StorageMapper;
import com.zgz.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(long productId, Integer count) {
        log.info("********->storage-service中扣减库存开始");
        storageMapper.decrease(productId,count);
        log.info("********->storage-service中扣减库存结束");
    }
}
