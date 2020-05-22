package com.example.demo;

// 第一个java接口
// @ + RestController 联想 出来

import org.springframework.web.bind.annotation.*;

@RestController

public class Hello {

    @GetMapping("/hello")
    @PostMapping
    public String hello() {
        return "你好！我是String boot框架！!";
    }

    @GetMapping("/test")
    public String a() {
        return "test";
    }

    //    http://192.168.1.7:8080/demo/1
    @GetMapping("/demo/{id}")
    public String demo(@PathVariable("id") String id) {
        System.out.println(id);
        return id;
    }

    //    http://192.168.1.7:8080/demo2?name=d%E7%9A%84
    @GetMapping("/demo2")
    public String demo2(@RequestParam(name = "name") String name) {
        System.out.println(name);
        return "名字是:" + name;
    }

    //    post 请求
    @PostMapping("/demo3")
    public String demo3(@RequestParam(name = "name") String name) {
        System.out.println(name);
        return "名字是:" + name;
    }

    //    post 请求 简单计算 192.168.1.7:8080/demo4?id=88&id1=66
    @PostMapping("/demo4")
    public String demo4(@RequestParam(name = "id") int id, @RequestParam(name = "id1") int id1) {
//        System.out.println(a);
        return "求和为:" + (id+id1);
    }

}