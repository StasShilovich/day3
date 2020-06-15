package com.shilovich.day3.entity;

import com.shilovich.day3.exception.BasketLoadException;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls = new ArrayList<>();
    private double capacity;

    public Basket() {
    }

    public Basket(double capacity) {
        this.capacity = capacity;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBall(Ball ball) throws BasketLoadException {
        double delta = capacity - calculateLoad();
        if (delta >= ball.getWeight()) {
            balls.add(ball);

        } else {
            throw new BasketLoadException("Basket full");
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double calculateLoad() {
        double load = 0;
        for (Ball ball : balls) {
            load += ball.getWeight();
        }
        return load;
    }
}
