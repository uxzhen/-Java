package com.example.demo.maysql;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserDao userDao;

    @GetMapping("/getAll")
    public List getAll() {
        List all = userDao.findAll();

        return all;
    }

    @GetMapping("/add")
    public User add() {
        User user = new User();
        user.setName("xudazhen");
        user.setAge(18);
        user.setAddress("sadsdasd");
        User save = userDao.save(user);
        return save;
    }


    //    127.0.0.1:8080/save?name=xasdasd&age=123&address=1231
    @PostMapping("/save")
    public String add(@RequestParam(name = "name") String name, @RequestParam(name = "address") String address, @RequestParam(name = "age") int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setAddress(address);
        userDao.save(user);
        return "ok";
    }
}
