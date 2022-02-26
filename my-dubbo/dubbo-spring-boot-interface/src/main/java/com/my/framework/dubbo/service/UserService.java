package com.my.framework.dubbo.service;

/**
 * @version 1.0
 * @description: 用户服务接口
 * @author: sw
 * @date 2022-02-26
 */
public interface UserService {
    /**
     * 查询用户信息
     * @param userId 用户编号
     * @return 结果
     */
    String queryUserById(Long userId);
}
