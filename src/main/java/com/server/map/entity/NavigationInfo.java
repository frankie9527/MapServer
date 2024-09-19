package com.server.map.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


//@Setter
//@Getter
//@Entity
//@Table(name = "navigation_infos")
public class NavigationInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String phone;

    private String location_name;
    private String destination_name;


}
