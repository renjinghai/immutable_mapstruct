package org.example.mapstruct;

import org.example.immutable.value.CarValue;
import org.example.mapstruct.pojo.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ToImmutableMapper {

    ToImmutableMapper INSTANCE = Mappers.getMapper(ToImmutableMapper.class);

    CarValue to(Car car);
}
