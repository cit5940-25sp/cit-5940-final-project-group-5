import org.junit.Test;
import static org.junit.Assert.*;

public class ThoughtTreeTest {

    @Test
    public void testRootInitialization() {
        ThoughtTree tree = new ThoughtTree("Root Decision");
        assertEquals("Root Decision", tree.getRoot().getDecision());
    }
}

