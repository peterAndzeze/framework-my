package com.my.framework.provider.service.impl;

import com.my.framework.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @version 1.0
 * @description: 服务实现
 * @author: sw
 * @date 2022-02-26
 */
@DubboService
public class UserServiceImpl implements UserService {
    @Override
    public String queryUserById(Long userId) {
        if(userId%2==0){
            return "偶数的人";
        }
        return "其它数的人";
    }
}
