package org.example.mapstruct;

import org.example.mapstruct.pojo.Car;
import org.example.mapstruct.pojo.CarDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarMapperTest {

    @Test
    public void testToCarDto() {
        final Car car = new Car("Morris", 5);

        final CarDto carDto = CarMapper.INSTANCE.to(car);

        assertNotNull(carDto);
        assertEquals("Morris", carDto.getMake());
        assertEquals(5, carDto.getSeatCount());
    }

    @Test
    public void testToCar() {
        final CarDto carDto = new CarDto("Morris", 5);

        final Car car = CarMapper.INSTANCE.to(carDto);
        assertNotNull(car);
        assertEquals("Morris", car.getMake());
        assertEquals(5, car.getNumberOfSeats());
    }
}
