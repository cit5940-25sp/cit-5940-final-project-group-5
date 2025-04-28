import java.util.*;

public class InfluenceEvaluator {
    private PriorityQueue<ThoughtAgent> agentQueue;
    private Stack<String> recentDecisions;

    public InfluenceEvaluator() {
        agentQueue = new PriorityQueue<>(Comparator.comparingInt(ThoughtAgent::getInfluenceScore).reversed());
        recentDecisions = new Stack<>();
    }

    public void evaluate(Set<ThoughtAgent> agents) {
        agentQueue.clear();
        agentQueue.addAll(agents);
    }

    public ThoughtAgent getTopAgent() {
        return agentQueue.isEmpty() ? null : agentQueue.peek();
    }

    public void rememberDecision(String decision) {
        recentDecisions.push(decision);
    }
}

