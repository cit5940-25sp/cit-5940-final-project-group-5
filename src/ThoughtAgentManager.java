import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ThoughtAgentManager {
    private Set<ThoughtAgent> agents;
    private Map<String, Integer> agentScores;

    public ThoughtAgentManager() {
        agents = new HashSet<>();
        agentScores = new HashMap<>();
    }

    public void addAgent(ThoughtAgent agent) {
        agents.add(agent);
        agentScores.put(agent.getName(), agent.getInfluenceScore());
    }

    public Set<ThoughtAgent> getAgents() {
        return agents;
    }

    public Map<String, Integer> getAgentScores() {
        return agentScores;
    }
}

