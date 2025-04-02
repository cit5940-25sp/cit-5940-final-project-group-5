public class ThoughtAgent {
    private String name;
    private int baseScore;
    private InfluenceStrategy strategy;

    public ThoughtAgent(String name, int baseScore, InfluenceStrategy strategy) {
        this.name = name;
        this.baseScore = baseScore;
        this.strategy = strategy;
    }

    public int getInfluenceScore() {
        return strategy.calculateInfluence(baseScore);
    }

    public void setStrategy(InfluenceStrategy strategy) {
        this.strategy = strategy;
    }

    public String getName() {
        return name;
    }

    public int getBaseScore() {
        return baseScore;
    }

    public void setBaseScore(int baseScore) {
        this.baseScore = baseScore;
    }

    @Override
    public String toString() {
        return name + " (Influence Score: " + getInfluenceScore() + ")";
    }
}
