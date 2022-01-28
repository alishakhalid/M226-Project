package plant.app;

public class Info {
    private String plantName;
    private String waterHowOften;
    private String season;
    private boolean isPoisonous;

    public Info(String plantName, String waterHowOften, String season, boolean isPoisonous) {
        this.plantName = plantName;
        this.waterHowOften = waterHowOften;
        this.season = season;
        this.isPoisonous = isPoisonous;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
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
