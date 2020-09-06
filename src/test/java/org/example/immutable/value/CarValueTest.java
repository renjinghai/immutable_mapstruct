package org.example.immutable.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarValueTest {

    @Test
    public void test() {

        final CarValue actual = ImmutableCarValue.builder()
                .make("Morris")
                .numberOfSeats(5)
                .build();

        assertNotNull(actual);

    }
}
