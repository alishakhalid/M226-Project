package plant_app.plant_classes;

import plant_app.Info;

public class Flower extends Plant {
    int numberOfPetals;

    public Flower(boolean isPotted, String color, float height, boolean hasFruit, boolean hasLeaves, Info info, int numberOfPetals) {
        super(isPotted, color, height, hasFruit, hasLeaves, info);
        this.numberOfPetals = numberOfPetals;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }
}