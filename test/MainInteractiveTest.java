import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;
import static org.junit.Assert.*;

public class MainInteractiveTest {
    @Test
    public void testAddAgentRunScenarioThenExit() {
        // Sequence: 1 (add), Alice, 50, 1 (Logical), 2 (run scenario), 3 (exit)
        String input = String.join("\n", "1", "Alice", "50", "1", "2", "3") + "\n";
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        InputStream originalIn = System.in;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setIn(inContent);
        System.setOut(new PrintStream(outContent));

        // Run main
        Main.main(new String[]{});

        // restore
        System.setIn(originalIn);
        System.setOut(originalOut);

        String output = outContent.toString();
        // Ensure agent addition and scenario message are present
        assertTrue(output.contains("Welcome to the Thought Process Simulation Engine!"));
        assertTrue(output.contains("Top thought agent for decision: Alice"));
    }
} 