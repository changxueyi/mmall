package com.mmall.service;

import com.mmall.common.R;
import com.mmall.dao.UserMapper;
import com.mmall.pojo.User;
import com.mmall.test.TestBase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName ServiceTest
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/1 14:35
 */
public class ServiceTest extends TestBase {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    DataSource dataSource;
    @Test
    public void ContextLoads() throws SQLException{
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
    }


    /*    @Test
        public void test01(){
            R r  = userService.login("xiaodan","123456");
            System.out.println(r);
        }*/
    @Test
    public void test02() {
        User user = userMapper.selectLogin("xiaodan", "123456");
        System.out.println(user);
    }
    
    @Test
    public void test03(){
        List user1 = userMapper.selectAll();
        System.out.println(user1);
    }

/*    @Test
    public void test04(){
       User user =  userService.login("xiaodan","123456");
        System.out.println(user);

    }*/
}