package cn.icexmoon.learngit.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName MyController
 * @Description
 * @Author icexmoon@qq.com
 * @Date 2026/1/29 14:30
 * @Version 1.0
 */
@RestController
@RequestMapping("/my")
public class MyController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
