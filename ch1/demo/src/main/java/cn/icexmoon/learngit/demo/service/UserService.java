package cn.icexmoon.learngit.demo.service;

import cn.icexmoon.learngit.demo.entity.User;

/**
 * @ClassName UserService
 * @Description
 * @Author icexmoon@qq.com
 * @Date 2026/1/30 14:36
 * @Version 1.0
 */
public interface UserService {
    public User getUserById(Long id);
}
