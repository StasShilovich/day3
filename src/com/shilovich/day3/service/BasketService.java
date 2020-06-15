package com.shilovich.day3.service;

import com.shilovich.day3.entity.Ball;
import com.shilovich.day3.entity.Basket;
import com.shilovich.day3.entity.Color;
import com.shilovich.day3.exception.BasketLoadException;

import java.util.List;
import java.util.Random;

public class BasketService {

    private static final int MIN_BALLS = 5;
    private static final int MAX_BALLS = 10;
    private static final double MIN_BALLS_WEIGHT = 0.05D;
    private static final double MAX_BALLS_WEIGHT = 0.3D;


    public boolean fillUpTheBasket(Basket basket) {
        boolean result = false;
        try {
            Random random = new Random();
            int ballsNumber = random.nextInt((MAX_BALLS - MIN_BALLS) + 1) + MIN_BALLS;
            for (int i = 0; i < ballsNumber; i++) {
                Ball ball = generateRandomBall(random);
                basket.setBall(ball);
            }
            result = true;
        } catch (BasketLoadException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    private Ball generateRandomBall(Random random) {
        double weight = random.nextDouble() * (MAX_BALLS_WEIGHT - MIN_BALLS_WEIGHT) + MIN_BALLS_WEIGHT;
        int colorValue = random.nextInt(Color.values().length);
        Color color = Color.values()[colorValue];
        Ball ball = new Ball(weight, color);
        return ball;
    }

    public int countNumberOfBlueBall(Basket basket) {
        int count = 0;
        List<Ball> balls = basket.getBalls();
        for (Ball ball : balls) {
            if (ball.getColor() == Color.BLUE) {
                count++;
            }
        }
        return count;
    }
}
