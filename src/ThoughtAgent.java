/**
 * The ThoughtAgent class represents an individual agent in the simulation
 * that makes decisions based on a defined influence strategy.
 * 
 * Each agent has:
 * - A name (identifier)
 * - A base score that reflects inherent potential or strength
 * - An InfluenceStrategy that determines how the base score translates into influence
 * 
 * The agent's influence can be evaluated dynamically using different strategies.
 */

public class ThoughtAgent {
    private String name;
    private int baseScore;
    private InfluenceStrategy strategy;

    /**
     * Constructs a ThoughtAgent with a name, base score, and influence strategy.
     *
     * @param name the agent's name
     * @param baseScore the agent's initial influence potential
     * @param strategy the strategy used to calculate actual influence
     */
    public ThoughtAgent(String name, int baseScore, InfluenceStrategy strategy) {
        this.name = name;
        this.baseScore = baseScore;
        this.strategy = strategy;
    }

    /**
     * Calculates the agent's total influence based on the strategy.
     *
     * @return the computed influence score
     */
    public int getInfluenceScore() {
        return strategy.calculateInfluence(baseScore);
    }

     /**
     * Sets a new influence strategy for the agent.
     *
     * @param strategy the new strategy to apply
     */
    public void setStrategy(InfluenceStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Gets the agent's name.
     *
     * @return the agent's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the agent's base score.
     *
     * @return the base score
     */
    public int getBaseScore() {
        return baseScore;
    }

    /**
     * Updates the agent's base score.
     *
     * @param baseScore the new base score
     */
    public void setBaseScore(int baseScore) {
        this.baseScore = baseScore;
    }

    /**
     * Returns a string representation of the agent.
     *
     * @return the agent's name and influence score
     */
    @Override
    public String toString() {
        return name + " (Influence Score: " + getInfluenceScore() + ")";
    }
}
