import org.junit.Test;
import static org.junit.Assert.*;

public class StrategyTest {

    @Test
    public void testLogicalStrategy() {
        InfluenceStrategy logic = new LogicalStrategy();
        assertEquals("Logical strategy should add 10 to base score", 60, logic.calculateInfluence(50));
    }

    @Test
    public void testExperienceStrategy() {
        InfluenceStrategy exp = new ExperienceStrategy();
        assertEquals("Experience strategy should add 5 to base score", 55, exp.calculateInfluence(50));
    }

    @Test
    public void testImpulseStrategyWithinBounds() {
        InfluenceStrategy imp = new ImpulseStrategy();
        int result = imp.calculateInfluence(50);
        assertTrue("Impulse strategy should return value between 0 and 100 inclusive", result >= 0 && result <= 100);
    }
} 