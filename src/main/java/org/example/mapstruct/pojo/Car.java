package org.example.mapstruct.pojo;

import java.util.List;

public class Car {

    private String make;
    private int numberOfSeats;
    private List<Wheel> wheels;

    public Car() {
    }

    public Car(String make, int numberOfSeats, List<Wheel> wheels) {
        this.make = make;
        this.numberOfSeats = numberOfSeats;
        this.wheels = wheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }
}
