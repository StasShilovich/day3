package com.shilovich.day3.main;
/*
Создать класс Мяч.Создать класс Корзина.Наполнить корзину мячиками.
Определить вес мячиков в корзине и кол-во синих мячиков
 */

import com.shilovich.day3.entity.Ball;
import com.shilovich.day3.entity.Basket;
import com.shilovich.day3.entity.Color;
import com.shilovich.day3.service.BasketService;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        BasketService basketService = new BasketService();
        Basket basket = new Basket(new ArrayList<>(), 1.5);
        Ball ball1 = new Ball(0.3, null);
        Ball ball2 = new Ball(0.1, Color.GREEN);
        Ball ball3 = new Ball(0.2, Color.YELLOW);
        Ball ball4 = new Ball(0.2, Color.RED);
        Ball ball5 = new Ball(0.2, Color.RED);
        boolean add1 = basket.add(ball1);
        boolean add2 = basket.add(ball2);
        boolean add3 = basket.add(ball3);
        boolean add4 = basket.add(ball4);
        boolean add5 = basket.add(ball5);
        boolean add6 = basket.add(null);
        System.out.println(add1 + " " + add2 + " " + add3 + " " + add4 + " " + add5 + " " + add6);
        double res = basket.calculateLoad();
        int count = basketService.countBallByColor(basket, Color.RED);
        System.out.println("Load " + res + " Count " + count);

    }
}
