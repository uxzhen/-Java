package com.example.demo.usser2;

import org.springframework.data.jpa.repository.JpaRepository;

// 此处的User2 对应表名
public interface User2Dao extends JpaRepository<User2,Integer> {

}