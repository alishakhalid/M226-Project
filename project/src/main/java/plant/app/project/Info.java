package plant.app.project;

public class Info {
    private String waterHowOften;
    private String season;
    private boolean isPoisonous;

    public Info(String waterHowOften, String season, boolean isPoisonous) {
        this.waterHowOften = waterHowOften;
        this.season = season;
        this.isPoisonous = isPoisonous;
    }

    public String getWaterHowOften() {
        return waterHowOften;
    }

    public void setWaterHowOften(String waterHowOften) {
        this.waterHowOften = waterHowOften;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }
}
