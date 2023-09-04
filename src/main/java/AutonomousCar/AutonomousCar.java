package AutonomousCar;

public class AutonomousCar {
    int carID;
    String brand;
    int noOfTestCaseConducted,noOfTestsPassed;
    String environment, grade;

    public AutonomousCar(int carID, String brand, int noOfTestCaseConducted, int noOfTestsPassed, String environment, String grade) {
        this.carID = carID;
        this.brand = brand;
        this.noOfTestCaseConducted = noOfTestCaseConducted;
        this.noOfTestsPassed = noOfTestsPassed;
        this.environment = environment;
        this.grade = grade;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNoOfTestCaseConducted() {
        return noOfTestCaseConducted;
    }

    public void setNoOfTestCaseConducted(int noOfTestCaseConducted) {
        this.noOfTestCaseConducted = noOfTestCaseConducted;
    }

    public int getNoOfTestsPassed() {
        return noOfTestsPassed;
    }

    public void setNoOfTestsPassed(int noOfTestsPassed) {
        this.noOfTestsPassed = noOfTestsPassed;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
