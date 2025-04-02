public class LogicalStrategy implements InfluenceStrategy {
    @Override
    public int calculateInfluence(int baseScore) {
        return baseScore + 10;
    }
}
