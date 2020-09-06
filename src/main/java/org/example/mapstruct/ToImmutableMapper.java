package org.example.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ToImmutableMapper {

    ToImmutableMapper INSTANCE = Mappers.getMapper(ToImmutableMapper.class);

    ImmutableCarValue to(Car car);
}
