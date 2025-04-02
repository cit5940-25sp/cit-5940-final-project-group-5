public class ImpulseStrategy implements InfluenceStrategy {
    @Override
    public int calculateInfluence(int baseScore) {
        return (int) (baseScore * (Math.random() * 2)); // random multiplier between 0 and 2
    }
}
