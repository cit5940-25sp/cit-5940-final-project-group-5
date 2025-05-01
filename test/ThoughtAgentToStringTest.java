import org.junit.Test;
import static org.junit.Assert.*;

public class ThoughtAgentToStringTest {

    @Test
    public void testToStringFormat() {
        ThoughtAgent agent = new ThoughtAgent("Logic", 50, new LogicalStrategy());
        String expected = "Logic (Influence Score: 60)";
        assertEquals(expected, agent.toString());
    }
} 