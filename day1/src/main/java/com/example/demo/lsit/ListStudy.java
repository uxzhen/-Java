package com.example.demo.lsit;

import java.util.ArrayList;
import java.util.List;

public class ListStudy {

    public static void main(String[] args) {
//        ArrayList  父类 List
//        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        System.out.println(list.size());
//
//        for (int index = 0; index < list.size(); index++) {
//            System.out.println(list.get(index));
//        }

//        集合使用类   carList.add(new Car(这里直接输入值));
        List<Car> carList = new ArrayList<>();
        carList.add(new Car( "特斯拉", 5555));
        carList.add(new Car( "bwm", 999999));
        carList.add(new Car( "武林宏观", 8888));
        carList.add(new Car( "本田", 222222));
        for (int index = 0; index < carList.size(); index++) {
            Car car = carList.get(index);

            System.out.println(car.getPinpai());
        }
    }

}
