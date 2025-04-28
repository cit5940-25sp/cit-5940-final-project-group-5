import org.junit.Test;
import static org.junit.Assert.*;

public class ThoughtAgentManagerTest {

    @Test
    public void testAddAgent() {
        ThoughtAgentManager manager = new ThoughtAgentManager();
        ThoughtAgent agent = new ThoughtAgent("Logic", 50, new LogicalStrategy());
        manager.addAgent(agent);

        assertTrue(manager.getAgents().contains(agent));
        assertEquals((Integer) 60, manager.getAgentScores().get("Logic"));
    }
}
