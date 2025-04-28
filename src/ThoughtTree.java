public class ThoughtTree {
    private ThoughtLayerNode root;

    public ThoughtTree(String rootDecision) {
        root = new ThoughtLayerNode(rootDecision);
    }

    public ThoughtLayerNode getRoot() {
        return root;
    }

    public void traverse(ThoughtLayerNode node) {
        if (node == null) return;
        System.out.println(node.getDecision());
        for (ThoughtLayerNode child : node.getChildren()) {
            traverse(child);
        }
    }
}

