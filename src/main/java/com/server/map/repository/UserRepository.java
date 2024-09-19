package com.server.map.repository;


import com.server.map.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    // 根据 phone 查询用户
   User findUserByPhone(String phone);

}
