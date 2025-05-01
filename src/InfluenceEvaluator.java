import java.util.*;

/**
 * The InfluenceEvaluator class is responsible for ranking ThoughtAgents based on their
 * influence score and keeping track of recent decisions made in the simulation.
 * 
 * - Uses a priority queue to dynamically sort agents from most to least influential.
 * - Maintains a stack to store a history of recent decisions for traceability or potential undo functionality.
 */

public class InfluenceEvaluator {
    private PriorityQueue<ThoughtAgent> agentQueue;
    public Stack<String> recentDecisions;

    public InfluenceEvaluator() {
        agentQueue = new PriorityQueue<>(Comparator.comparingInt(ThoughtAgent::getInfluenceScore).reversed());
        recentDecisions = new Stack<>();
    }

    /**
     * Evaluates a given set of ThoughtAgents and ranks them based on their influence scores.
     * Clears any previous evaluation results.
     *
     * @param agents a set of ThoughtAgents to be evaluated
     */
    public void evaluate(Set<ThoughtAgent> agents) {
        agentQueue.clear();
        agentQueue.addAll(agents);
    }

    /**
     * Retrieves the agent with the highest influence score.
     *
     * @return the top ThoughtAgent or null if no agents are available
     */
    public ThoughtAgent getTopAgent() {
        return agentQueue.isEmpty() ? null : agentQueue.peek();
    }

    /**
     * Stores a new decision in the decision history stack.
     *
     * @param decision the decision string to be recorded
     */
    public void rememberDecision(String decision) {
        recentDecisions.push(decision);
    }
}

