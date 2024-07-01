package finalexam.task4;

import java.io.Serializable;

public class Vehicle implements Serializable {
    private String model;
    private String licensePlate;
    private int capacity;

    public Vehicle(String model, String licensePlate, int capacity) {
        this.model = model;
        this.licensePlate = licensePlate;
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Vehicle [model=" + model + ", licensePlate=" + licensePlate + ", capacity=" + capacity + "]";
    }
}
