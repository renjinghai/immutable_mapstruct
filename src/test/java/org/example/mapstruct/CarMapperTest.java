package org.example.mapstruct;

import com.google.common.collect.ImmutableList;
import org.example.mapstruct.pojo.Car;
import org.example.mapstruct.pojo.CarDto;
import org.example.mapstruct.pojo.Wheel;
import org.example.mapstruct.pojo.WheelDto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarMapperTest {

    @Test
    public void testToCarDto() {
        final Car car = new Car("Morris", 5,  ImmutableList.of(new Wheel(50)));

        final CarDto carDto = CarMapper.INSTANCE.to(car);

        assertNotNull(carDto);
        assertEquals("Morris", carDto.getMake());
        assertEquals(5, carDto.getSeatCount());
        assertEquals(ImmutableList.of(new WheelDto(50)), carDto.getWheels());
    }

    @Test
    public void testToCar() {
        final CarDto carDto = new CarDto("Morris", 5,  ImmutableList.of(new WheelDto(50)));

        final Car car = CarMapper.INSTANCE.to(carDto);
        assertNotNull(car);
        assertEquals("Morris", car.getMake());
        assertEquals(5, car.getNumberOfSeats());
        assertEquals(ImmutableList.of(new Wheel(50)), car.getWheels());
    }
}
