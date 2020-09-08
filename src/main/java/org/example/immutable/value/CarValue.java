package org.example.immutable.value;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface CarValue {

    String getMake();
    int getNumberOfSeats();
    List<WheelValue> getWheels();
}
