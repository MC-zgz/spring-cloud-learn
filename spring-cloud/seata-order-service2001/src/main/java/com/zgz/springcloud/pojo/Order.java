package com.zgz.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private long id;
    private long userId;
    private long productId;
    private Integer count;
    private BigDecimal money;
    private Integer status;

}
