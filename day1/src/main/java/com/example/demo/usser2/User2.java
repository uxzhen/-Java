package com.example.demo.usser2;

import javax.persistence.Entity;
import javax.persistence.Id;

//这里链接的表名
@Entity(name = "user2")
//@Entity
//：指定了Entity所要映射带数据库表，其中@Table.name()用来指定映射表的表名。如果缺省@Table注释，系统默认采用类名作为映射表的表名
public class User2 {
//    大多数语法来自一jpa
// id为主键 ，
    @Id
    private int id;
    private double height;
    private String time;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
