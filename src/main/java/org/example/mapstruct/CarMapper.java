package org.example.mapstruct;

import org.example.mapstruct.pojo.Car;
import org.example.mapstruct.pojo.CarDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto to(Car car);

    @InheritInverseConfiguration
    Car to(CarDto dto);
}
