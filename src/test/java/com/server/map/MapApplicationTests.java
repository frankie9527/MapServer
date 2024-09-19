package com.server.map;

import com.server.map.entity.NaviDemo;
import com.server.map.entity.NavigationInfos;
import com.server.map.entity.User;
import com.server.map.repository.NaviDemoRepository;
import com.server.map.repository.NavigationRepository;
import com.server.map.repository.UserRepository;
import com.server.map.service.NavigationService;
import org.junit.jupiter.api.Test;
import org.postgresql.geometric.PGpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MapApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NavigationRepository navigationRepository;

    @Autowired
    private NaviDemoRepository naviDemoRepository;
//    @Test
//    void addUser() {
//        User user=  new User();
//        user.setPhone("123456789");
//        user.setName("demo");
//        userRepository.save(user);
//    }
//
//    @Test
//    void addNavi() {
//        NavigationInfos info = new NavigationInfos();
//        info.setPhone("123456789");
//        navigationRepository.save(info);
//    }

//    @Test
//    void addNaviDemo() {
//        NaviDemo naviDemo = new NaviDemo();
//        naviDemo.setName("demo");
//        PGpoint pGpoint = new PGpoint(37.7749, -122.4194);
//        naviDemo.setLocation(pGpoint);
//        naviDemoRepository.save(naviDemo);
//    }
}
