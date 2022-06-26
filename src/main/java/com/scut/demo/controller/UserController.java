package com.scut.demo.controller;

import com.scut.demo.entity.User;
import com.scut.demo.service.UserService;
import com.scut.demo.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//学生和老师的控制器
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login/{type}")
    Result login(@RequestBody User user, @PathVariable String type){ //type: 学生或老师
        User u = userService.login(user,type);
        if(u==null){ //登录失败
            return Result.error().message("未找到用户");
        }
        else{
            return Result.ok().message("登录成功").put("User",u);
        }
    }


}
