package plant.app.project;

public class Flower extends Plant implements Identifiable{
    int numberOfPetals;
    public Flower(String color, int length, boolean hasFruit, boolean hasLeaves, Info info, int numberOfPetals) {
        super(color, length, hasFruit, hasLeaves, info);
        this.numberOfPetals = numberOfPetals;
    }

    @Override
    public Plant identifyPlant(Plant p) {
        return p;
    }

    public int getNumberOfPetals() {
        return numberOfPetals;
    }

    public void setNumberOfPetals(int numberOfPetals) {
        this.numberOfPetals = numberOfPetals;
    }
}
