package org.example.mapstruct;

import org.example.immutable.value.CarValue;
import org.example.immutable.value.ImmutableCarValue;
import org.example.mapstruct.pojo.CarDto;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FromImmutableMapperTest {

    @Disabled
    @Test
    public void carDtoFromImmutable() {
        final CarValue car = ImmutableCarValue.builder()
                .make("Morris")
                .numberOfSeats(5)
                .build();

        final CarDto carDto = FromImmutableMapper.INSTANCE.to(car);

        assertNotNull(carDto);
        assertEquals("Morris", carDto.getMake());
        assertEquals(5, carDto.getSeatCount());
    }
}
