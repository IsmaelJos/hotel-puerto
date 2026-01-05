package org.docencia.hotel.mapper.jpa;

import org.mapstruct.Mapper;
import org.docencia.hotel.domain.model.Hotel;
import org.docencia.hotel.persistence.jpa.entity.HotelEntity;
import org.mapstruct.Mapping;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface HotelMapper {

    @Mapping(target = "rooms", ignore= true)
    HotelEntity toEntity(Hotel domain);

    @Mapping(target = "rooms",  ignore= true)
    Hotel toDomain(HotelEntity entity);

    Set<Hotel> toDomain(Set<HotelEntity> bookings);

    Set<HotelEntity> toEntity(Set<Hotel> bookings);
}
