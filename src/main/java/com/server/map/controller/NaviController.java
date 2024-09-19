package com.server.map.controller;

import com.server.map.entity.NavigationInfos;
import com.server.map.entity.NavigationInfosRequest;
import com.server.map.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NaviController {
    @Autowired
    NavigationService service;

    // http://localhost:8080/starNavi
    @PostMapping("/starNavi")
    public ResponseEntity<NavigationInfos> starNavi(@RequestBody NavigationInfosRequest request) {
        return service.startNavi(request);

    }
}
