package org.docencia.hotel.domain.api;

import org.docencia.hotel.domain.model.Hotel;

import java.util.Set;

public interface HotelDomain {
    boolean existsById(Long id);
    Hotel findById(Long id);
    Set<Hotel> findAll();
    Hotel save(Hotel hotel);
    boolean deleteById(Long id);
}
