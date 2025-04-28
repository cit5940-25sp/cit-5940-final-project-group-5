import org.junit.Test;
import static org.junit.Assert.*;

public class ThoughtAgentTest {

    @Test
    public void testGetInfluenceScore() {
        ThoughtAgent agent = new ThoughtAgent("Logic", 50, new LogicalStrategy());
        assertEquals(60, agent.getInfluenceScore());
    }

    @Test
    public void testSetStrategy() {
        ThoughtAgent agent = new ThoughtAgent("Test", 50, new LogicalStrategy());
        agent.setStrategy(new ExperienceStrategy());
        assertEquals(55, agent.getInfluenceScore());
    }

    @Test
    public void testBaseScoreModification() {
        ThoughtAgent agent = new ThoughtAgent("Impulse", 50, new ImpulseStrategy());
        agent.setBaseScore(70);
        assertEquals(70, agent.getBaseScore());
    }
}