import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The ThoughtAgentManager class is responsible for managing a collection of ThoughtAgents
 * and tracking their influence scores.
 * 
 * Responsibilities:
 * - Stores and maintains a set of unique ThoughtAgents
 * - Keeps a mapping of agent names to their evaluated influence scores
 * 
 * This manager provides access to the current set of agents and their corresponding scores,
 * which can be used for evaluation or reporting within the simulation.
 */
public class ThoughtAgentManager {
    private Set<ThoughtAgent> agents;
    private Map<String, Integer> agentScores;

    public ThoughtAgentManager() {
        agents = new HashSet<>();
        agentScores = new HashMap<>();
    }

    /**
     * Adds a new agent to the manager and records their influence score.
     *
     * @param agent the ThoughtAgent to add
     */
    public void addAgent(ThoughtAgent agent) {
        agents.add(agent);
        agentScores.put(agent.getName(), agent.getInfluenceScore());
    }

    /**
     * Returns the set of all managed agents.
     *
     * @return a Set of ThoughtAgents
     */
    public Set<ThoughtAgent> getAgents() {
        return agents;
    }

    /**
     * Returns a map of agent names to their influence scores.
     *
     * @return a Map with agent names as keys and influence scores as values
     */
    public Map<String, Integer> getAgentScores() {
        return agentScores;
    }
}

