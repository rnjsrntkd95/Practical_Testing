package com.example.cafe_kiosk.unit.beverage;

public class Latte implements Beverage {

    @Override
    public String getName() {
        return "라떼";
    }

    @Override
    public int getPrice() {
        return 4500;
    }
}