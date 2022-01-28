package plant.app;

public class Succulent extends Plant {
    private boolean hasSpikes;

    public Succulent(String color, int length, boolean hasFruit, boolean hasLeaves, boolean hasBlossom, boolean hasSpikes) {
        super(color, length, hasFruit, hasLeaves, hasBlossom);
        this.hasSpikes = hasSpikes;
    }

    public boolean isHasSpikes() {
        return hasSpikes;
    }

    public void setHasSpikes(boolean hasSpikes) {
        this.hasSpikes = hasSpikes;
    }
}
