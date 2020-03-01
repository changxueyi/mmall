package com.mmall.service.impl;

import com.mmall.common.R;
import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import com.mmall.service.UserService;
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
        int resultCount = userMapper.checkUsername(username);
     /*   if (resultCount==0){
            return R.error("用户名不存在");
        }*/
        //密码登录MD5
        User user = userMapper.selectLogin(username,password);
       /* if (user==null){
            return R.error("密码错误");
        }
        user.setPassword(StringUtils.EMPTY);
        return R.ok().put("登录成功",user);*/
       return user;
    }
}