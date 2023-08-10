package com.example.cafe_kiosk.unit;

import com.example.cafe_kiosk.unit.beverage.Beverage;
import com.example.cafe_kiosk.unit.order.Order;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CafeKiosk {

    private final List<Beverage> beverages = new ArrayList<>();

    public void add(Beverage beverage) {
        beverages.add(beverage);
    }

    public void add(Beverage beverage, int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("음료는 1잔 이상 주문하실 수 있습니다.");
        }
        for (int i = 0; i < count; i++) {
            beverages.add(beverage);
        }
    }

    public void remove(Beverage beverage) {
        beverages.remove(beverage);
    }

    public void clear() {
        beverages.clear();
    }

    public int calculateTotalPrice() {
        return beverages.stream()
                .map(Beverage::getPrice)
                .reduce(Integer::sum)
                .orElse(0);
    }

    public Order createOrder() {
        return new Order(LocalDateTime.now(), beverages);
    }
}
