package org.example.mapstruct;

public class Car {

    private String make;
    private int numberOfSeats;

    public Car() {
    }

    public Car(String make, int numberOfSeats) {
        this.make = make;
        this.numberOfSeats = numberOfSeats;
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
}
