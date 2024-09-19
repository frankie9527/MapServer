package com.server.map.repository;

import com.server.map.entity.NavigationInfos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NavigationRepository extends JpaRepository<NavigationInfos,Long> {

}
