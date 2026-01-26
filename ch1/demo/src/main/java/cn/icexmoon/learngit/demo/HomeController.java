package cn.icexmoon.learngit.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HomeController
 * @Description
 * @Author icexmoon@qq.com
 * @Date 2026/1/22 09:42
 * @Version 1.0
 */
@RestController
@RequestMapping("/home")
public class HomeController {
    @GetMapping("/index")
    public String index(){
        return "hello";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

    @GetMapping("/test2")
    public String test2(){
        return "test2";
    }

    @GetMapping("/test3")
    public String test3(){
        return "test3";
    }

    @GetMapping("/test4")
    public String test4(){
        return "test4";
    }
}
