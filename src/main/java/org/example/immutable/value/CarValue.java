package org.example.immutable.value;

import org.immutables.value.Value;

@Value.Immutable
public interface CarValue {

    String make();
    int numberOfSeats();
}
