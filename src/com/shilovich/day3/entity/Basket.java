package com.shilovich.day3.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final static double MAX_HOLDING_CAPACITY = 1.5D;
    private final static double MIN_HOLDING_CAPACITY = 0.5D;

    private List<Ball> balls = new ArrayList<>();
    private double holdingCapacity;

    public Basket() {
    }

    public Basket(List<Ball> balls, double holdingCapacity) {
        this.balls = balls;
        this.holdingCapacity = holdingCapacity;
    }

    public Ball get(int index) {
        return balls.get(index);
    }

    public boolean add(Ball ball) {
        boolean result = false;
        double delta = holdingCapacity - calculateLoad();
        if (ball == null) return false;
        if (delta >= ball.getWeight() && ball.getColor() != null) {
            balls.add(ball);
            result = true;
        }
        return result;
    }

    public double getHoldingCapacity() {
        return holdingCapacity;
    }

    public boolean setHoldingCapacity(double holdingCapacity) {
        boolean result = false;
        if (holdingCapacity <= MAX_HOLDING_CAPACITY && holdingCapacity >= MIN_HOLDING_CAPACITY) {
            this.holdingCapacity = holdingCapacity;
            result = true;
        }
        return result;
    }

    public int calculateBallsLength() {
        return balls.size();
    }

    public double calculateLoad() {
        double load = 0;
        for (Ball ball : balls) {
            load += ball.getWeight();
        }
        return load;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        if (Double.compare(basket.holdingCapacity, holdingCapacity) != 0) return false;
        return balls.equals(basket.balls);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = balls.hashCode();
        temp = Double.doubleToLongBits(holdingCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder("Basket{");
        builder.append("balls=").append(balls);
        builder.append(", holdingCapacity=").append(holdingCapacity);
        builder.append('}');
        return builder.toString();
    }
}
