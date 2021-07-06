package model;

public class UniversityStudent extends Student {

    double CPA;
    String major;

    public UniversityStudent(int ID, String name, String address) {
        super(ID, name, address);
    }

    @Override
    public void showInfo() {
        System.out.println("University: " + this.name  + this.major + this.CPA);
    }

    @Override
    public void inputInfo() {
        this.CPA = 3.2;
        this.major = "major";
    }

    public double getCPA() {
        return CPA;
    }

    public void setCPA(float CPA) {
        this.CPA = CPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "UniversityStudent{" +
                "CPA=" + CPA +
                ", major='" + major + '\'' +
                ", ID=" + ID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

