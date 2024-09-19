package com.server.map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//java -jar build/libs/map-0.0.1-SNAPSHOT.jar --server.address=0.0.0.0 --server.port=8080
@SpringBootApplication
public class MapApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapApplication.class, args);
    }

}
