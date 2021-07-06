package model;

public class HighSchoolStudent extends Student {
    private int mathScore;
    private int physicScore;
    private int chemicalScore;

    public HighSchoolStudent(int ID, String name, String address) {
        super(ID, name, address);
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getPhysicScore() {
        return physicScore;
    }

    public void setPhysicScore(int physicScore) {
        this.physicScore = physicScore;
    }

    public int getChemicalScore() {
        return chemicalScore;
    }

    public void setChemicalScore(int chemicalScore) {
        this.chemicalScore = chemicalScore;
    }

    public void showInfo() {
        System.out.println("Highschool: " + this.name + this.chemicalScore + this.mathScore + this.physicScore);
    }

    @Override
    public void inputInfo() {
        this.physicScore = 10;
        this.mathScore = 11;
        this.chemicalScore = 12;
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "mathScore=" + mathScore +
                ", physicScore=" + physicScore +
                ", chemicalScore=" + chemicalScore +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
