public class SimulationEngine {
    private ThoughtAgentManager agentManager;
    private ThoughtTree thoughtTree;
    private InfluenceEvaluator evaluator;

    public SimulationEngine() {
        agentManager = new ThoughtAgentManager();
        thoughtTree = new ThoughtTree("Root Decision");
        evaluator = new InfluenceEvaluator();
    }

    public void runScenario() {
        evaluator.evaluate(agentManager.getAgents());
        ThoughtAgent topAgent = evaluator.getTopAgent();
        if (topAgent != null) {
            System.out.println("Top thought agent for decision: " + topAgent.getName());
        }
    }

    public ThoughtAgentManager getAgentManager() {
        return agentManager;
    }

    public ThoughtTree getThoughtTree() {
        return thoughtTree;
    }
}

