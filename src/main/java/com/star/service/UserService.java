package com.star.service;

import com.star.po.User;

/**
 * @Author: ONESTAR
 * @QQ群: 530311074
 * @URL: https://onestar.newstar.net.cn/
 */
public interface UserService {

    User checkUser(String username, String password);
}
