package com.server.map.entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NavigationInfosRequest {
    private String phone;
    private String startPointName;
    private double startLatitude;
    private double startLongitude;

    private String endPointName;
    private double endLatitude;
    private double endLongitude;


}
