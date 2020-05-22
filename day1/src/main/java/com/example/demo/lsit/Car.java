package com.example.demo.lsit;

public class Car {
    private  String pinpai;
    private int jaige;

    public String getPinpai() {
        return pinpai;
    }

    public void setPinpai(String pinpai) {
        this.pinpai = pinpai;
    }

    public int getJaige() {
        return jaige;
    }

    public void setJaige(int jaige) {
        this.jaige = jaige;
    }

    public Car(String pingpai, int jaige) {
        this.pinpai = pingpai;
        this.jaige = jaige;
    }
}
