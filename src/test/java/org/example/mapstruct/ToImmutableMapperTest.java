package org.example.mapstruct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ToImmutableMapperTest {

    @Test
    public void carToImmutable() {
        final Car car = new Car("Morris", 5);

        final ImmutableCarValue carValue = ToImmutableMapper.INSTANCE.to(car);

        assertNotNull(carValue);
        assertEquals("Morris", carValue.make());
        assertEquals(5, carValue.numberOfSeats());
    }
}
