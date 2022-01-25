package plant.app.project;

public class Succulent extends Plant implements Identifiable {
    private boolean hasSpikes;

    public Succulent(String color, int length, boolean hasFruit, boolean hasLeaves, Info info, boolean hasSpikes) {
        super(color, length, hasFruit, hasLeaves, info);
        this.hasSpikes = hasSpikes;
    }

    @Override
    public Plant identifyPlant(Plant p) {
        return p;
    }

    public boolean isHasSpikes() {
        return hasSpikes;
    }

    public void setHasSpikes(boolean hasSpikes) {
        this.hasSpikes = hasSpikes;
    }
}
