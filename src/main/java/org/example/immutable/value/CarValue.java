package org.example.immutable.value;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface CarValue {

    String make();
    int numberOfSeats();
    List<WheelValue> wheels();
}
