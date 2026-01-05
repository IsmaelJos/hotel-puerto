package org.docencia.hotel.service.api;

import org.docencia.hotel.domain.model.Guest;
import org.docencia.hotel.domain.model.GuestPreferences;

import java.util.Set;

public interface GuestService {
    boolean existsById(Long id);

    Guest findById(Long id);

    Set<Guest> findAll();

    Guest save(Guest guest);

    boolean deleteById(Long id);

    GuestPreferences savePreferences(Long guestId, GuestPreferences preferences);

    boolean deletePreferenceById(Long guestId);

    GuestPreferences findPreferenceById(Long guestId);
}
