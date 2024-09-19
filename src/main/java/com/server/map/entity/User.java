package com.server.map.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//{"name": "John", "phone": "13668232308"}
@Setter
@Getter
@Entity
@Table(name = "users",uniqueConstraints = {@UniqueConstraint(columnNames = "phone_number")})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String phone;
    private String name;
}
