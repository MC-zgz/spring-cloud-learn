package com.zgz.springcloud.service;

import com.zgz.springcloud.mapper.AccountMapper;

import javax.annotation.Resource;
import java.math.BigDecimal;

public interface AccountService {
     void decrease(Long userId, BigDecimal money);

}
