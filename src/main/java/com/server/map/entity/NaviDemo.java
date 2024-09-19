package com.server.map.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.postgresql.geometric.PGpoint;

@Setter
@Getter
@Entity
@Table(name = "navi")
public class NaviDemo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "location")
    private PGpoint location;
}
