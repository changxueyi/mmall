package com.mmall.controller.portal;
import com.mmall.common.Const;
import com.mmall.common.R;
import com.mmall.pojo.User;
import com.mmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


/**
 * @ClassName UserController
 * @Description TODO
 * @Author changxueyi
 * @Date 2020/3/1 14:15
 */
@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public R login(@RequestParam String username, @RequestParam String password, HttpSession session){
        User data = userService.login(username,password);
        if (data==null){
            return R.error("用户名或密码不正确");
        }else {
            session.setAttribute(Const.CURRENT_USER,data);
            return R.ok().put("data",data);
        }
    }

    @RequestMapping(value = "logout.do",method =RequestMethod.POST)
    @ResponseBody
    public R logout(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return R.ok().put("msg","success");
    }
}