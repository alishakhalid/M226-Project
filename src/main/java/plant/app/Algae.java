package plant.app;

public class Algae extends Plant {
    private boolean isToxic;
    private boolean looksLikeGrass;

    public Algae(String color, int length, boolean hasFruit, boolean hasLeaves, boolean hasFlower, boolean isToxic, boolean looksLikeGrass) {
        super(color, length, hasFruit, hasLeaves, hasFlower);
        this.isToxic = isToxic;
        this.looksLikeGrass = looksLikeGrass;
    }

    public boolean isToxic() {
        return isToxic;
    }

    public void setToxic(boolean toxic) {
        isToxic = toxic;
    }

    public boolean isLooksLikeGrass() {
        return looksLikeGrass;
    }

    public void setLooksLikeGrass(boolean looksLikeGrass) {
        this.looksLikeGrass = looksLikeGrass;
    }
}
