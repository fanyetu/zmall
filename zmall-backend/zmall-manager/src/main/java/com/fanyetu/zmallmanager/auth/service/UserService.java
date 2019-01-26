package com.fanyetu.zmallmanager.auth.service;

import com.fanyetu.zmallmanager.auth.model.User;

/**
 * @author zhanghaonan
 * @date 2019/1/26
 */
public interface UserService {

    User queryByUsername(String username);
}
