package org.example.immutable.value;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface CarValue {

    //the method name has to be getXXX
    String getMake();
    int getNumberOfSeats();
    List<WheelValue> getWheels();
}
