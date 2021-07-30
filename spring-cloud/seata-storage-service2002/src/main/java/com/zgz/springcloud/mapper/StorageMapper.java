package com.zgz.springcloud.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageMapper {
    /**
     * 扣减库存
     * @param productId
     * @param count
     * @return
     */
    int decrease(@Param("productId") long productId,@Param("count")Integer count);
}
