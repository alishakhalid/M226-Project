package plant.app.project;

public class Mushroom implements Identifiable {
    private boolean looksLikeWearingHat;
    private String color;
    private boolean poisonous;

    @Override
    public Plant identifyPlant(Plant p) {
        return p;
    }
}
