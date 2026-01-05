package org.docencia.hotel.service.api;

import org.docencia.hotel.domain.model.Room;

import java.util.Set;

public interface RoomService {

    boolean existsById(Long id);

    Room findById(Long id);

    Set<Room> findAll();

    Room save(Room room);

    boolean deleteById(Long id);

    Room findByHotelId(Long hotelId);
}
