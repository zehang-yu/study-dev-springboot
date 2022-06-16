package com.scut.demo.controller;

import com.scut.demo.entity.User;
import com.scut.demo.service.UserService;
import com.scut.demo.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final static Logger log = LoggerFactory.getLogger(UserController.class);

    /**
     * @Autowired 是自动注入的意思
     * 在Spring中，我们的对象都放到IOC容器中，由Spring帮我们管理，
     * Spring会在启动时就帮我们创建好非懒加载的单例bean，放到单例池（就是IOC容器中）
     * 当我们需要使用时，Spring帮我们从容器中拿出来，并把他赋值给我们的引用
     *
     */
    @Autowired
    UserService userService;

    /**
     * @PostMapping("/login") 接收和处理 post请求且请求路径是 /login
     * @RequestBody 需要接收json参数（以请求体的方式接收） 并把对应的值 set 进 User 对象
     *
     * @param user
     * @return
     */
    @PostMapping("/login")
    public Result handleLogin(@RequestBody User user){
        User u = userService.handleLogin(user);
        log.info("登录结果：{}", u);
        return u != null ? Result.ok().put("result", "登录成功") : Result.error().put("result","登录失败，请核对信息");
    }

    @PostMapping("/register")
    public Result handleRegister(@RequestBody User user){
        System.out.println(user);
        int i = userService.handleRegister(user);
        log.info("注册结果：{}", i);
        return i != 0 ? Result.ok().put("result", "注册成功") : Result.error().put("result","用户名被占用，请重新注册");
    }
}
