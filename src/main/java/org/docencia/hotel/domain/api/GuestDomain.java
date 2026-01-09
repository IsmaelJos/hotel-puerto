package org.docencia.hotel.domain.api;

import org.docencia.hotel.domain.model.Guest;
import org.docencia.hotel.domain.model.GuestPreferences;

import java.util.Set;

public interface GuestDomain {

    boolean existsById(Long id);

    Guest findById(Long id);

    Set<Guest> findAll();

    Guest save(Guest guest);

    boolean deleteById(Long id);

    GuestPreferences savePreferences(Long guestId, GuestPreferences preferences);

    boolean deletePreferenceById(Long guestId);

    GuestPreferences findPreferenceById(Long guestId);

}
