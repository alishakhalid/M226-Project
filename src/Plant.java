public class Plant {

    private boolean isPotted;
    private String color;
    private float height;
    private boolean hasFruit;
    private boolean hasLeaves;
    private Info info;

    public Plant(boolean isPotted, String color, float height, boolean hasFruit, boolean hasLeaves, Info info) {
        this.isPotted = isPotted;
        this.color = color;
        this.height = height;
        this.hasFruit = hasFruit;
        this.hasLeaves = hasLeaves;
        this.info = info;
    }

    public boolean isPotted() {
        return isPotted;
    }

    public void setPotted(boolean potted) {
        isPotted = potted;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isHasFruit() {
        return hasFruit;
    }

    public void setHasFruit(boolean hasFruit) {
        this.hasFruit = hasFruit;
    }

    public boolean isHasLeaves() {
        return hasLeaves;
    }

    public void setHasLeaves(boolean hasLeaves) {
        this.hasLeaves = hasLeaves;
    }
}