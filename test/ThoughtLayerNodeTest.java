import org.junit.Test;
import static org.junit.Assert.*;

public class ThoughtLayerNodeTest {

    @Test
    public void testAddChild() {
        ThoughtLayerNode parent = new ThoughtLayerNode("Root");
        ThoughtLayerNode child = new ThoughtLayerNode("Child");

        parent.addChild(child);

        assertEquals(1, parent.getChildren().size());
        assertEquals("Child", parent.getChildren().get(0).getDecision());
    }
}
