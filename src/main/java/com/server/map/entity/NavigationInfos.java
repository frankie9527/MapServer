package com.server.map.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.postgresql.geometric.PGpoint;

import java.io.Serializable;


@Setter
@Getter
@Entity
@Table(name = "navigation_infos")
public class NavigationInfos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String phone;

    @Column(name = "start_point")//, columnDefinition = "point"
    private PGpoint startPoint;
    @Column(name = "start_point_name")
    private String startPointName;
    @Column(name = "end_point")
    private PGpoint endPoint;
    @Column(name = "end_point_name")
    private String endPointName;



}
