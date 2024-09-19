package com.server.map.repository;

import com.server.map.entity.NaviDemo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaviDemoRepository extends JpaRepository<NaviDemo,Long> {

}
