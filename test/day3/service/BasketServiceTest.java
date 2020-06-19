package day3.service;

import com.shilovich.day3.entity.Ball;
import com.shilovich.day3.entity.Basket;
import com.shilovich.day3.entity.Color;
import com.shilovich.day3.service.BasketService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class BasketServiceTest {

    BasketService service;
    Basket basket;

    @BeforeClass
    public void setUp() {
        service = new BasketService();
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(0.1D, Color.RED));
        balls.add(new Ball(0.2D, Color.GREEN));
        balls.add(new Ball(0.1D, Color.YELLOW));
        balls.add(new Ball(0.3D, Color.RED));
        basket = new Basket(balls, 1D);
    }

    @Test
    public void testCountingBallByColorPositive() {
        int actual = service.countBallByColor(basket, Color.RED);
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testCountingBallByColorPositive")
    public void testCountingBallByColorNegative() {
        int actual = service.countBallByColor(basket, Color.RED);
        int expected = 3;
        assertNotEquals(actual, expected);
    }
}
