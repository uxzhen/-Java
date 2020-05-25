package com.example.demo.usser2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class User2Controller {
    @Autowired
    User2Dao user2Dao;

    @GetMapping("/user2/getAll")
    public List getAll(){
        List all = user2Dao.findAll();
        return all;
    }
}
