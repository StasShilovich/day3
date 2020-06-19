package test.shilovich.day3.creator;

import com.shilovich.day3.creator.BallCreator;
import com.shilovich.day3.entity.Ball;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BallCreatorTest {

    private static final double MIN_BALLS_WEIGHT = 0.05D;
    private static final double MAX_BALLS_WEIGHT = 0.3D;

    BallCreator creator;

    @BeforeClass
    public void setUp() {
        creator = new BallCreator();
    }

    @Test
    public void testRandomBallBound() {
        Ball ball = creator.generateRandomBall();
        boolean condition = ball.getWeight() >= MIN_BALLS_WEIGHT && ball.getWeight() <= MAX_BALLS_WEIGHT;
        assertTrue(condition);
    }
}
