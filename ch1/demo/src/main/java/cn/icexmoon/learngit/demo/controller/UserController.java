package cn.icexmoon.learngit.demo.controller;

import cn.icexmoon.learngit.demo.entity.User;
import cn.icexmoon.learngit.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName UserController
 * @Description
 * @Author icexmoon@qq.com
 * @Date 2026/1/30 14:38
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/{id}")
    public User getUserInfo(@PathVariable Long id){
        return userService.getUserById(id);
    }
}
