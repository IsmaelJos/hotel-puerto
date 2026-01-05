package org.docencia.hotel.service.api;

import org.docencia.hotel.domain.model.Booking;

import java.util.Set;

public interface BookingService {

    boolean existsById(Long id);

    Booking findById(Long id);

    Set<Booking> findAll();

    Booking save(Booking booking);

    boolean deleteById(Long id);

    Booking findByRoomIdAndDateRange(Long roomId, String checkin, String checkout);
}
