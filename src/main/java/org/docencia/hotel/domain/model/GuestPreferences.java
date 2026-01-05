package org.docencia.hotel.domain.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
import java.util.Objects;

public class GuestPreferences {
    private Long guestId;

    private String preferredLanguage;

    private boolean newsLetterOptIn;

    private List<String> tags;

    private String favoriteRoomType;

    private String notes;


    public GuestPreferences() {
    }

    public GuestPreferences(Long guestId) {
        this.guestId = guestId;
    }

    public GuestPreferences(Long guestId, String preferredLanguage, boolean newsLetterOptIn, List<String> tags, String favoriteRoomType, String notes) {
        this.guestId = guestId;
        this.preferredLanguage = preferredLanguage;
        this.newsLetterOptIn = newsLetterOptIn;
        this.tags = tags;
        this.favoriteRoomType = favoriteRoomType;
        this.notes = notes;
    }

    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public boolean isNewsLetterOptIn() {
        return newsLetterOptIn;
    }

    public void setNewsLetterOptIn(boolean newsLetterOptIn) {
        this.newsLetterOptIn = newsLetterOptIn;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getFavoriteRoomType() {
        return favoriteRoomType;
    }

    public void setFavoriteRoomType(String favoriteRoomType) {
        this.favoriteRoomType = favoriteRoomType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GuestPreferences that = (GuestPreferences) o;
        return Objects.equals(guestId, that.guestId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(guestId);
    }

    @Override
    public String toString() {
        return "GuestPreferences{" +
                "guestId=" + guestId +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                ", newsLetterOptIn=" + newsLetterOptIn +
                ", tags=" + tags +
                ", favoriteRoomType='" + favoriteRoomType + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
