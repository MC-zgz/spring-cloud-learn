package com.zgz.springcloud.service.Impl;

import com.zgz.springcloud.mapper.StorageMapper;
import com.zgz.springcloud.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageMapper storageMapper;

    @Override
    public void decrease(long productId, Integer count) {
        storageMapper.decrease(productId,count);
    }
}
