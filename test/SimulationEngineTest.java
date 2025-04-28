import org.junit.Test;
import static org.junit.Assert.*;

public class SimulationEngineTest {

    @Test
    public void testSimulationEngineCreation() {
        SimulationEngine engine = new SimulationEngine();
        assertNotNull(engine.getAgentManager());
        assertNotNull(engine.getThoughtTree());
    }
}

