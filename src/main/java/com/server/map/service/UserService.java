package com.server.map.service;

import com.server.map.entity.User;
import com.server.map.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    // 注册用户
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    // 查找所有用户
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    // 通过手机号码查找用户
    public User findUserByPhone(String phone) {
        return userRepository.findUserByPhone(phone);
    }
}
