import java.util.ArrayList;
import java.util.List;

public class ThoughtLayerNode {
    private String decision;
    private List<ThoughtLayerNode> children;

    public ThoughtLayerNode(String decision) {
        this.decision = decision;
        this.children = new ArrayList<>();
    }

    public void addChild(ThoughtLayerNode child) {
        children.add(child);
    }

    public List<ThoughtLayerNode> getChildren() {
        return children;
    }

    public String getDecision() {
        return decision;
    }
}

