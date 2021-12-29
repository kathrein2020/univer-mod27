package Statistics;
import Enum.StudyProfile;


public class Statistic {

    private StudyProfile profile;
    private float avgScore;
    private int numberOfStud;
    private int numberOfUni;
    private String uniNames;

    public StudyProfile getProfile() {
        return profile;
    }

    public Statistic setProfile(StudyProfile profile) {
        this.profile = profile;
        return this;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public Statistic setAvgScore(float avgExamScore) {
        this.avgScore = avgScore;
        return this;
    }

    public int getNumberOfStud() {
        return numberOfStud;
    }

    public Statistic setNumberOfStud(int numberOfStud) {
        this.numberOfStud = numberOfStud;
        return this;
    }

    public int getNumberOfUni() {
        return numberOfUni;
    }

    public Statistic setNumberOfUni(int numberOfUni) {
        this.numberOfUni = numberOfUni;
        return this;
    }

    public String getUniNames() {
        return uniNames;
    }

    public Statistic setUniNames(String uniNames) {
        this.uniNames = uniNames;
        return this;
    }
}