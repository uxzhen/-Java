package com.example.demo.maysql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserDao userDao ;

    @GetMapping("/getAll")
    public List getAll(){
        List all = userDao.findAll();

        return  all;
    }
}
