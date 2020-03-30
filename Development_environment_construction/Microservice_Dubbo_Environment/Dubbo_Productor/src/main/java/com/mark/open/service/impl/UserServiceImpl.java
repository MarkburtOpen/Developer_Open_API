package com.mark.open.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mark.open.domain.User;
import com.mark.open.service.UserService;

/**
 * @Author Markburt
 * @Description :
 * @DATE: 2020/3/30
 * @TIME: 上午 02:02
 * @YEAR: 2020
 * @Version :
 **/

@Service
public class UserServiceImpl implements UserService
{
    @Override
    public User saveUser(User user) {
        user.setId(1);

        return user;
    }
}
