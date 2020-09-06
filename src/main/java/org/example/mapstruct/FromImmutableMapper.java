package org.example.mapstruct;

import org.example.immutable.value.CarValue;
import org.example.mapstruct.pojo.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FromImmutableMapper {

    FromImmutableMapper INSTANCE = Mappers.getMapper(FromImmutableMapper.class);

    CarDto to(CarValue car);
}
