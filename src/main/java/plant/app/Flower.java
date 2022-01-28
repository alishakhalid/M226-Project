package plant.app;

/**
 *
 */
public class Flower extends Plant {
    int numberOfPetals;
    public Flower(String color, int length, boolean hasFruit, boolean hasLeaves, boolean hasBlossom, int numberOfPetals) {
        super(color, length, hasFruit, hasLeaves, hasBlossom);
        this.numberOfPetals = numberOfPetals;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }
}
