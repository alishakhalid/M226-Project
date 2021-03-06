package plant.app;

public class Plant {
    private String color;
    private int length;
    private boolean hasFruit;
    private boolean hasLeaves;
    private boolean hasBlossom;
    private Info info;

    public Plant(String color, int length, boolean hasFruit, boolean hasLeaves, boolean hasBlossom, Info info) {
        this.color = color;
        this.length = length;
        this.hasFruit = hasFruit;
        this.hasLeaves = hasLeaves;
        this.hasBlossom = hasBlossom;
        this.info = info;
    }

    public Plant(String color, int length, boolean hasFruit, boolean hasLeaves, boolean hasBlossom) {
        this.color = color;
        this.length = length;
        this.hasFruit = hasFruit;
        this.hasLeaves = hasLeaves;
        this.hasBlossom = hasBlossom;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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

    public boolean isHasBlossom() {
        return hasBlossom;
    }

    public void setHasBlossom(boolean hasFlower) {
        this.hasBlossom = hasFlower;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
