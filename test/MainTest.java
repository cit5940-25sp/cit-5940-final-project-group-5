import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMainExitsGracefullyWithExitOption() {
        String input = "3\n"; // immediately choose Exit
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        InputStream originalIn = System.in;

        // Capture System.out to ensure main prints welcome message
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setIn(inContent);
        System.setOut(new PrintStream(outContent));

        // Should run without throwing exceptions
        Main.main(new String[]{});

        // Restore IO
        System.setIn(originalIn);
        System.setOut(originalOut);

        String output = outContent.toString();
        assertTrue(output.contains("Welcome to the Thought Process Simulation Engine!"));
        assertTrue(output.contains("Menu:"));
    }
} 