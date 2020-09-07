package org.example.pojo;

import java.util.List;

public class CarDto {

    private String make;
    private int seatCount;
    private List<WheelDto> wheels;

    public CarDto() {
    }

    public CarDto(String make, int seatCount, List<WheelDto> wheels) {
        this.make = make;
        this.seatCount = seatCount;
        this.wheels = wheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public List<WheelDto> getWheels() {
        return wheels;
    }

    public void setWheels(List<WheelDto> wheels) {
        this.wheels = wheels;
    }
}
