package com.shilovich.day3.main;

import com.shilovich.day3.creator.BasketCreator;
import com.shilovich.day3.entity.Basket;
import com.shilovich.day3.entity.Color;
import com.shilovich.day3.service.BasketService;

public class Main {

    public static void main(String[] args) {
        BasketService basketService = new BasketService();
        BasketCreator basketCreator = new BasketCreator();
        Basket basket = basketCreator.createBasket();
        basketCreator.fillUpTheBasket(basket);
        System.out.println(basket);
        double res = basket.calculateLoad();
        int count = basketService.countBallByColor(basket, Color.BLUE);
        System.out.println("Load " + res + " Count " + count);
    }
}
