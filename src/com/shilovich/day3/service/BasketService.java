package com.shilovich.day3.service;

import com.shilovich.day3.entity.Basket;
import com.shilovich.day3.entity.Color;

public class BasketService {

    private static final int MIN_BALLS = 5;
    private static final int MAX_BALLS = 10;
    private static final double MIN_BALLS_WEIGHT = 0.05D;
    private static final double MAX_BALLS_WEIGHT = 0.3D;


    public int countBallByColor(Basket basket, Color color) {
        int count = 0;
        int length = basket.calculateBallsLength();
        for (int i = 0; i < length; i++) {
            Color colorActual = basket.get(i).getColor();
            if (colorActual == color) {
                count++;
            }
        }
        return count;
    }
}
