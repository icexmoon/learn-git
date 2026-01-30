package cn.icexmoon.learngit.demo.entity;

import lombok.Data;

/**
 * @ClassName User
 * @Description
 * @Author icexmoon@qq.com
 * @Date 2026/1/30 14:35
 * @Version 1.0
 */
@Data
public class User {
    private Long id;
    private String name;

    public User(String name) {
        this.name = name;
    }
}
