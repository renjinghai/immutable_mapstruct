package org.example.mapstruct;

import org.immutables.value.Value;

@Value.Immutable
public interface CarValue {

    String make();
    int numberOfSeats();
}
