/**
 * The SimulationEngine class coordinates the core components of the
 * thought process simulation. It acts as the central controller for:
 * 
 * - Managing agents through ThoughtAgentManager
 * - Evaluating influence via InfluenceEvaluator
 * - Structuring decisions in a hierarchical ThoughtTree
 * 
 * The engine is responsible for executing decision-making scenarios
 * and exposing access to its main components.
 */

public class SimulationEngine {
    private ThoughtAgentManager agentManager;   // Manages the collection of ThoughtAgents
    private ThoughtTree thoughtTree;    // Represents a decision tree used in simulations
    private InfluenceEvaluator evaluator;   // Evaluates and ranks agents based on influence

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

