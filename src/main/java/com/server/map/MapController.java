package com.server.map;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MapController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    //http://localhost:8080/registerUser
    @PostMapping("/registerUser")
    public String handleInsertUserRequest(@RequestBody User user){
        System.out.println("jyh handleInsertUserRequest: " + user.name);
        return "success handle user request"+user.name;
    }
    //http://localhost:8080/dealNavi
    @PostMapping("/dealNavi")
    public String handleNaviRequest(@RequestBody NaviData data){
        return "success handle navi request key"+ data.key;
    }
}
