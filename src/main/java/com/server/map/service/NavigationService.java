package com.server.map.service;

import com.server.map.entity.NavigationInfos;
import com.server.map.entity.NavigationInfosRequest;
import com.server.map.repository.NavigationRepository;

import org.postgresql.geometric.PGpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NavigationService {
    @Autowired
    NavigationRepository navigationRepository;

    public ResponseEntity<NavigationInfos> startNavi(NavigationInfosRequest request) {
        NavigationInfos infos = new NavigationInfos();
        infos.setPhone(request.getPhone());
        infos.setStartPointName(request.getStartPointName());
        PGpoint startPoint = new PGpoint(request.getStartLongitude(), request.getStartLatitude());
        infos.setStartPoint(startPoint);

        infos.setEndPointName(request.getEndPointName());
        PGpoint endPoint = new PGpoint(request.getEndLongitude(), request.getEndLatitude());
        infos.setEndPoint(endPoint);
        navigationRepository.save(infos);

        return ResponseEntity.ok(infos);

    }
}
