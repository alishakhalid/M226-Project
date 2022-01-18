public class Succulent extends Plant {
    private boolean hasSpikes;

    public Succulent(boolean isPotted, String color, float height, boolean hasFruit, boolean hasLeaves, Info info, boolean hasSpikes) {
        super(isPotted, color, height, hasFruit, hasLeaves, info);
        this.hasSpikes = hasSpikes;
    }
}
