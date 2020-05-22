package com.example.demo.lsit;

// 对外提供接口

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListApi {

    @GetMapping("/getList")
    public List getList() {
        List<String> list = new ArrayList<>();

        list.add("sadasda");
        list.add("sadasda");
        list.add("sadasd1a");

        return list;
    }

}
