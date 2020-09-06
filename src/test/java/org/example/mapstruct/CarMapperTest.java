package org.example.mapstruct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarMapperTest {

    @Test
    public void carToDto() {
        final Car car = new Car("Morris", 5);

        final CarDto carDto = CarMapper.INSTANCE.to(car);

        assertNotNull(carDto);
        assertEquals("Morris", carDto.getMake());
        assertEquals(5, carDto.getSeatCount());
    }
}
