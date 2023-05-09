package cn.mycloudway.user.service;

import cn.mycloudway.user.mapper.UserMapper;
import cn.mycloudway.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}