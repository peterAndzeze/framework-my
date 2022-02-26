package com.my.framework.dubbo.consumber.controller;

import com.my.framework.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description: 人员
 * @author: sw
 * @date 2022-02-26
 */
@RestController
@RequestMapping("/dubbo")
public class UserController {
    @DubboReference
    private UserService userService;
    @RequestMapping("queryUser/{userId}")
    public String queryUser(@PathVariable("userId") Long userId){
        return userService.queryUserById(userId);
    }
}
