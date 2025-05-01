import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ThoughtTreeTraversalTest {

    @Test
    public void testTraversalOutputsAllDecisions() {
        // Capture System.out
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ThoughtTree tree = new ThoughtTree("Root");
        ThoughtLayerNode child1 = new ThoughtLayerNode("Child1");
        ThoughtLayerNode child2 = new ThoughtLayerNode("Child2");
        ThoughtLayerNode grandChild = new ThoughtLayerNode("GrandChild");

        tree.getRoot().addChild(child1);
        tree.getRoot().addChild(child2);
        child1.addChild(grandChild);

        tree.traverse(tree.getRoot());

        // Restore System.out
        System.setOut(originalOut);

        String output = outContent.toString();
        assertTrue(output.contains("Root"));
        assertTrue(output.contains("Child1"));
        assertTrue(output.contains("Child2"));
        assertTrue(output.contains("GrandChild"));
    }
} 