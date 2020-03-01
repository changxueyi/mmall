package com.mmall.controller.portal;
import com.mmall.common.Const;
import com.mmall.common.R;
import com.mmall.dto.UserDTO;
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

   /* @RequestMapping(value = "login.do",method = RequestMethod.POST)
    @ResponseBody
    public R login(@RequestParam String username,@RequestParam String password){
        R r = userService.login(username,password);
      //  session.setAttribute(Const.CURRENT_USER,r);
        return R.ok();
    }*/
}