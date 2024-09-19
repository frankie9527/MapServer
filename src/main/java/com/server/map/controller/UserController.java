package com.server.map.controller;

import com.server.map.entity.User;

import com.server.map.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    // http://localhost:8080/registerUser
    @PostMapping("/registerUser")
    public User handleRegisterUserRequest(@RequestBody User user){
        return userService.registerUser(user);
    }

    // 获取所有用户
    // http://localhost:8080/users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // http://localhost:8080/findUserByPhone?phone=13668232308
    @GetMapping("/findUserByPhone")
    public User getUserByPhoneNum(@RequestParam(value = "phone", defaultValue = "Frankie") String phone) {
        return userService.findUserByPhone(phone);
    }
}
