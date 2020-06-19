package com.shilovich.day3.creator;

import com.shilovich.day3.entity.Ball;
import com.shilovich.day3.entity.Basket;

public class BasketCreator {

    public Basket createBasket() {
        Basket basket = new Basket();
        basket.setHoldingCapacity(1D);
        return basket;
    }

    public void fillUpTheBasket(Basket basket) {
        boolean flag = true;
        BallCreator creator = new BallCreator();
        while (flag) {
            Ball ball = creator.generateRandomBall();
            flag = basket.add(ball);
        }
    }
}
