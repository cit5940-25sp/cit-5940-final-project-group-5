public class ExperienceStrategy implements InfluenceStrategy {
    @Override
    public int calculateInfluence(int baseScore) {
        return baseScore + 5;
    }
}
