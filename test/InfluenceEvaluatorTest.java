import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;

public class InfluenceEvaluatorTest {

    @Test
    public void testEvaluateAndTopAgent() {
        ThoughtAgent agent1 = new ThoughtAgent("Logic", 50, new LogicalStrategy());
        ThoughtAgent agent2 = new ThoughtAgent("Impulse", 30, new ImpulseStrategy());

        Set<ThoughtAgent> agents = new HashSet<>();
        agents.add(agent1);
        agents.add(agent2);

        InfluenceEvaluator evaluator = new InfluenceEvaluator();
        evaluator.evaluate(agents);

        assertEquals("Logic", evaluator.getTopAgent().getName());
    }

    @Test
    public void testRememberDecision() {
        InfluenceEvaluator evaluator = new InfluenceEvaluator();
        evaluator.rememberDecision("First Decision");

        assertFalse(evaluator.recentDecisions.isEmpty());
    }
}

