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
        return "index";
    }

    @GetMapping("/commit1")
    public String commit1(){
        return "commit1";
    }


    @GetMapping("/commit2")
    public String commit2(){
        return "commit2";
    }

    @GetMapping("/commit3")
    public String commit3(){
        return "commit3";
    }

    @GetMapping("/hello1")
    public String hello1(){
        return "hello1";
    }

    @GetMapping("/hello2")
    public String hello2(){
        return "hello2";
    }
}
