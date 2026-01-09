package org.docencia.hotel.persistence.nosql.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;
import java.util.Objects;

@Document(collection = "guest_preferences")
public class GuestPreferencesDocument {

    @Id
    private Long guestId;

    @Field("preferredLanguage")
    private String preferredLanguage;

    @Field("newsLetterOptIn")
    private boolean newsLetterOptIn;

    @Field("tags")
    private List<String> tags;

    @Field("favoriteRoomType")
    private String favoriteRoomType;

    @Field("notes")
    private String notes;

    public GuestPreferencesDocument() {
    }

    public GuestPreferencesDocument(Long guestId, String preferredLanguage,
                                    boolean newsLetterOptIn, List<String> tags, String favoriteRoomType, String notes) {

        this.guestId = guestId;
        this.preferredLanguage = preferredLanguage;
        this.newsLetterOptIn = newsLetterOptIn;
        this.tags = tags;
        this.favoriteRoomType = favoriteRoomType;
        this.notes = notes;
    }

    public GuestPreferencesDocument(Long guestId) {
        this.guestId = guestId;
    }

    public Long getGuestId() {
        return this.guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public boolean getNewsLetterOptIn() {
        return this.newsLetterOptIn;
    }

    public void setNewsLetterOptIn(boolean newsLetterOptIn) {
        this.newsLetterOptIn = newsLetterOptIn;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getFavoriteRoomType() {
        return this.favoriteRoomType;
    }

    public void setFavoriteRoomType(String favoriteRoomType) {
        this.favoriteRoomType = favoriteRoomType;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GuestPreferencesDocument)) {
            return false;
        }
        GuestPreferencesDocument guestPreferences = (GuestPreferencesDocument) o;
        return Objects.equals(guestId, guestPreferences.guestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guestId);
    }

    @Override
    public String toString() {
        return "{"
                + " guestId='" + getGuestId() + "'"
                + ", preferredLanguage='" + getPreferredLanguage() + "'"
                + ", newsletterOptIn='" + getNewsLetterOptIn() + "'"
                + ", tags='" + getTags() + "'"
                + ", favoriteRoomType='" + getFavoriteRoomType() + "'"
                + ", notes='" + getNotes() + "'"
                + "}";
    }
}