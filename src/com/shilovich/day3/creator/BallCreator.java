package com.shilovich.day3.creator;

import com.shilovich.day3.entity.Ball;
import com.shilovich.day3.entity.Color;

import java.util.Random;

public class BallCreator {

    private static final double MIN_BALLS_WEIGHT = 0.05D;
    private static final double MAX_BALLS_WEIGHT = 0.3D;

    public Ball generateRandomBall() {
        Random random = new Random();
        double weight = random.nextDouble() * (MAX_BALLS_WEIGHT - MIN_BALLS_WEIGHT) + MIN_BALLS_WEIGHT;
        int colorValue = random.nextInt(Color.values().length);
        Color color = Color.values()[colorValue];
        Ball ball = new Ball(weight, color);
        return ball;
    }
}
