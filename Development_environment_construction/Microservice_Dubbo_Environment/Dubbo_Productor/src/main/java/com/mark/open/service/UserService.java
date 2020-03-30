package com.mark.open.service;

import com.mark.open.domain.User;

/**
 * @Author Markburt
 * @Description :
 * @DATE: 2020/3/30
 * @TIME: 上午 02:01
 * @YEAR: 2020
 * @Version :
 **/
public interface UserService {
    /**
     * 保存用户
     * @param user
     * @return
     */
    User saveUser(User user);
}
