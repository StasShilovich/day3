package com.shilovich.day3.main;
/*
Создать класс Мяч.Создать класс Корзина.Наполнить корзину мячиками.
Определить вес мячиков в корзине и кол-во синих мячиков
 */

import com.shilovich.day3.entity.Basket;
import com.shilovich.day3.service.BasketService;


public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket(1D);
        BasketService basketService = new BasketService();
        basketService.fillUpTheBasket(basket);
        double res = basket.calculateLoad();
        int count=basketService.countNumberOfBlueBall(basket);
        System.out.println("Load "+res+" Count "+count);

    }
}
