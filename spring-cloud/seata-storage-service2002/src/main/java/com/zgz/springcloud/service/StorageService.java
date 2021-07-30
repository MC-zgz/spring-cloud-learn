package com.zgz.springcloud.service;

public interface StorageService {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(long productId,Integer count);
}
