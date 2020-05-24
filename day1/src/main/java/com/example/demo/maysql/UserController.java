package com.example.demo.maysql;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

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


    //  添加数据库  127.0.0.1:8080/save?name=xasdasd&age=123&address=1231
    @PostMapping("/save")
    public String save(@RequestParam(name = "name") String name, @RequestParam(name = "address") String address, @RequestParam(name = "age") int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setAddress(address);
        userDao.save(user);
        return "ok";
    }

    // 更新数据库  127.0.0.1:8080/upData?id=3&name=a333&age=10&address
    @PostMapping("/upData")
    public String upData(@RequestParam(name = "name") String name, @RequestParam(name = "address") String address, @RequestParam(name = "age") int age, @RequestParam(name = "id") int id) {
        User user = new User();
        user.setName(name);
        user.setId(id);
        user.setAge(age);
        user.setAddress(address);
        userDao.save(user);
        return "ok";
    }
    @PostMapping("/delAll")
    public String deleteAll() {

        userDao.deleteAll();
        return "删除成功";
    }

    //    删除单个数据
    @PostMapping("/delOne")
    public String delOne(@RequestParam("id") int id) {

        userDao.deleteById(id);
        return "删除成功";
    }




}
