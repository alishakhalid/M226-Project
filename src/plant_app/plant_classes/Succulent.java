package plant_app.plant_classes;

import plant_app.Info;

public class Succulent extends Plant {
    private boolean hasSpikes;

    public Succulent(boolean isPotted, String color, float height, boolean hasFruit, boolean hasLeaves, Info info, boolean hasSpikes) {
        super(isPotted, color, height, hasFruit, hasLeaves, info);
        this.hasSpikes = hasSpikes;
    }

    public boolean isHasSpikes() {
        return hasSpikes;
    }

    public void setHasSpikes(boolean hasSpikes) {
        this.hasSpikes = hasSpikes;
    }
}
