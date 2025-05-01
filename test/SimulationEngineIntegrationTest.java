import org.junit.Test;
import static org.junit.Assert.*;

public class SimulationEngineIntegrationTest {

    @Test
    public void testRunScenarioSelectsTopAgent() {
        SimulationEngine engine = new SimulationEngine();
        engine.getAgentManager().addAgent(new ThoughtAgent("Logic", 40, new LogicalStrategy()));
        engine.getAgentManager().addAgent(new ThoughtAgent("Experience", 35, new ExperienceStrategy()));

        // Capture top agent using evaluator directly after scenario run
        engine.runScenario();
        String topName = engine.getAgentManager().getAgentScores().entrySet().stream()
                .max(java.util.Map.Entry.comparingByValue())
                .get().getKey();

        assertEquals("Logic", topName);
    }
} 