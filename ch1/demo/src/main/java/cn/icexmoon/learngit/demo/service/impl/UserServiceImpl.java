package cn.icexmoon.learngit.demo.service.impl;

import cn.icexmoon.learngit.demo.entity.User;
import cn.icexmoon.learngit.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author icexmoon@qq.com
 * @Date 2026/1/30 14:37
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(Long id) {
        return new User("icexmoon");
    }
}
