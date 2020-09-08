package org.example.mapstruct;

import org.example.immutable.value.CarValue;
import org.example.pojo.Car;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CrossMapper {

    CrossMapper INSTANCE = Mappers.getMapper(CrossMapper.class);

    CarValue to(Car car);

    @InheritInverseConfiguration
    Car to(CarValue car);
}