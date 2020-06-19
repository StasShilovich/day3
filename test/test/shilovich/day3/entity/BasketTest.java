package test.shilovich.day3.entity;

import com.shilovich.day3.entity.Ball;
import com.shilovich.day3.entity.Basket;
import com.shilovich.day3.entity.Color;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

public class BasketTest {

    Basket basket;

    @BeforeClass
    public void setUp() {
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(0.1D, Color.RED));
        balls.add(new Ball(0.2D, Color.GREEN));
        balls.add(new Ball(0.1D, Color.YELLOW));
        balls.add(new Ball(0.3D, Color.RED));
        basket = new Basket(balls, 1D);
    }

    @Test
    public void testAddPositive() {
        Basket newBasket = new Basket();
        newBasket.setHoldingCapacity(1D);
        boolean condition = newBasket.add(new Ball(0.1, Color.RED));
        assertTrue(condition);
    }

    @Test(dependsOnMethods = "testAddPositive")
    public void testAddNegative() {
        Basket newBasket = new Basket();
        boolean condition = newBasket.add(new Ball(1.1, Color.RED));
        assertFalse(condition);
    }

    @Test
    public void testHoldingCapacitySetterPositive() {
        Basket newBasket = new Basket();
        boolean condition = newBasket.setHoldingCapacity(1.5D);
        assertTrue(condition);
    }

    @Test(dependsOnMethods = "testHoldingCapacitySetterPositive")
    public void testHoldingCapacitySetterNegative() {
        Basket newBasket = new Basket();
        boolean condition = newBasket.setHoldingCapacity(2D);
        assertFalse(condition);
    }

    @Test
    public void testLoadCalculationPositive() {
        double actual = basket.calculateLoad();
        double expected = 0.7D;
        assertEquals(actual, expected);
    }

    @Test(dependsOnMethods = "testLoadCalculationPositive")
    public void testLoadCalculationNegative() {
        double actual = basket.calculateLoad();
        double expected = 0.8D;
        assertNotEquals(actual, expected);
    }
}
