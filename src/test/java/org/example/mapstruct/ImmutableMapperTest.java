package org.example.mapstruct;

import com.google.common.collect.ImmutableList;
import org.example.immutable.value.CarValue;
import org.example.immutable.value.ImmutableCarValue;
import org.example.immutable.value.ImmutableWheelValue;
import org.example.pojo.Car;
import org.example.pojo.Wheel;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ImmutableMapperTest {

    @Test
    public void testToImmutable() {
        final Car car = new Car("Morris", 5, ImmutableList.of(new Wheel(50)));

        final CarValue carValue = ImmutableMapper.INSTANCE.to(car);

        assertNotNull(carValue);
        assertEquals("Morris", carValue.make());
        assertEquals(5, carValue.numberOfSeats());
        assertEquals(ImmutableList.of(ImmutableWheelValue.builder().size(50).build()), carValue.wheels());
    }

    @Disabled
    @Test
    public void testFromImmutable() {
        final CarValue carValue = ImmutableCarValue.builder()
                .make("Morris")
                .numberOfSeats(5)
                .addWheels(ImmutableWheelValue.builder().size(50).build())
                .build();

        final Car car = ImmutableMapper.INSTANCE.to(carValue);

        assertNotNull(car);
        assertEquals("Morris", car.getMake());
        assertEquals(5, car.getNumberOfSeats());
        assertEquals(ImmutableList.of(new Wheel(50)), car.getWheels());
    }
}
