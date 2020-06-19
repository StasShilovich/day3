package com.shilovich.day3.service;

import com.shilovich.day3.entity.Basket;
import com.shilovich.day3.entity.Color;

public class BasketService {

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
