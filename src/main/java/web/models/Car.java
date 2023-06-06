package web.models;

public class Car {
    public Car(String model, int motor, int series) {
        this.model = model;
        this.motor = motor;
        this.series = series;
    }

    private String model;
    private int motor;
    private int series;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
