package com.mmall.service.impl;

import com.mmall.common.R;
import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import com.mmall.service.UserService;
import com.mmall.utils.MD5Utils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/1 13:52
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
       /* String md5Password = MD5Utils.MD5EncodeUtf8(password);*/
        User data = userMapper.login(username, password);
        data.setPassword(org.apache.commons.lang3.StringUtils.EMPTY);
        return data;
    }

    @Override
    public int checkUsername(String username) {
        return userMapper.checkUsername(username);
    }
}