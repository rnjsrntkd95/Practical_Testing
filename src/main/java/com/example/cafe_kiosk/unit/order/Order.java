package com.example.cafe_kiosk.unit.order;

import com.example.cafe_kiosk.unit.beverage.Beverage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Order {

    private final LocalDateTime orderTime;
    private final List<Beverage> beverages;
}

