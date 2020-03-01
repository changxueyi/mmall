package com.mmall.service;

import com.mmall.common.R;
import com.mmall.pojo.User;

public interface UserService {
    User login(String username,String password);
    int checkUsername(String username);
}
