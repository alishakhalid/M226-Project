package plant.app;

public class Mushroom{
    private boolean looksLikeWearingHat;
    private String color;
    private boolean poisonous;

    public Mushroom(boolean looksLikeWearingHat, String color, boolean poisonous) {
        this.looksLikeWearingHat = looksLikeWearingHat;
        this.color = color;
        this.poisonous = poisonous;
    }

    public boolean isLooksLikeWearingHat() {
        return looksLikeWearingHat;
    }

    public void setLooksLikeWearingHat(boolean looksLikeWearingHat) {
        this.looksLikeWearingHat = looksLikeWearingHat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPoisonous() {
        return poisonous;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }
}


