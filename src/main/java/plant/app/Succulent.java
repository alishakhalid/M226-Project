package plant.app;

public class Succulent extends Plant {
    private boolean hasSpikes;

    public Succulent(String color, int length, boolean hasFruit, boolean hasLeaves, Info info, boolean hasSpikes) {
        super(color, length, hasFruit, hasLeaves, info);
        this.hasSpikes = hasSpikes;
    }

    public boolean isHasSpikes() {
        return hasSpikes;
    }

    public void setHasSpikes(boolean hasSpikes) {
        this.hasSpikes = hasSpikes;
    }
}
