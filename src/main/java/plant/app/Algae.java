package plant.app;

public class Algae extends Plant {
    private boolean isToxic;

    public Algae(String color, int length, boolean hasFruit, boolean hasLeaves, Info info, boolean isToxic) {
        super(color, length, hasFruit, hasLeaves, info);
        this.isToxic = isToxic;
    }

    public boolean isToxic() {
        return isToxic;
    }

    public void setToxic(boolean toxic) {
        isToxic = toxic;
    }
}
