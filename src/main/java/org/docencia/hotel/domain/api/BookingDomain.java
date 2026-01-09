package org.docencia.hotel.domain.api;

import org.docencia.hotel.domain.model.Booking;

import java.time.LocalDate;
import java.util.Set;

public interface BookingDomain {
    boolean existsById(Long id);
    Booking findById(Long id);
    Set<Booking> findAll();
    Booking save(Booking booking);
    boolean deleteById(Long id);
    Booking findByRoomIdAndDateRange(Long roomId, LocalDate checkin, LocalDate checkout);
}
