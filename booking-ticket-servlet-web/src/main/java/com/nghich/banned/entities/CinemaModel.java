package com.nghich.banned.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CinemaModel {

    @JsonProperty("cinema_id")
    public Integer cinemaId;
    @JsonProperty("cinema_name")
    public String cinemaName;
    @JsonProperty("cinema_name_s1")
    public String cinemaNameS1;
    @JsonProperty("cinema_name_s2")
    public String cinemaNameS2;
    @JsonProperty("cinema_phone")
    public String cinemaPhone;
    @JsonProperty("cinema_address")
    public String cinemaAddress;
    @JsonProperty("cinema_latitude")
    public Double cinemaLatitude;
    @JsonProperty("cinema_longitude")
    public Double cinemaLongitude;
    @JsonProperty("cinema_slug")
    public String cinemaSlug;
    @JsonProperty("cinema_logo")
    public String cinemaLogo;
    @JsonProperty("cinema_image")
    public String cinemaImage;
    @JsonProperty("cinema_image_large")
    public String cinemaImageLarge;
    @JsonProperty("logo_url")
    public String logoUrl;
    @JsonProperty("list_price")
    public String listPrice;
    @JsonProperty("max_seat")
    public Integer maxSeat;
    @JsonProperty("p_cinema_id")
    public Integer pCinemaId;
    @JsonProperty("p_cinema_name")
    public String pCinemaName;
    @JsonProperty("p_cinema_logo")
    public String pCinemaLogo;
    @JsonProperty("location_id")
    public Integer locationId;
    @JsonProperty("cinema_slug_new")
    public String cinemaSlugNew;

    public Integer getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(Integer cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaNameS1() {
        return cinemaNameS1;
    }

    public void setCinemaNameS1(String cinemaNameS1) {
        this.cinemaNameS1 = cinemaNameS1;
    }

    public String getCinemaNameS2() {
        return cinemaNameS2;
    }

    public void setCinemaNameS2(String cinemaNameS2) {
        this.cinemaNameS2 = cinemaNameS2;
    }

    public String getCinemaPhone() {
        return cinemaPhone;
    }

    public void setCinemaPhone(String cinemaPhone) {
        this.cinemaPhone = cinemaPhone;
    }

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    public Double getCinemaLatitude() {
        return cinemaLatitude;
    }

    public void setCinemaLatitude(Double cinemaLatitude) {
        this.cinemaLatitude = cinemaLatitude;
    }

    public Double getCinemaLongitude() {
        return cinemaLongitude;
    }

    public void setCinemaLongitude(Double cinemaLongitude) {
        this.cinemaLongitude = cinemaLongitude;
    }

    public String getCinemaSlug() {
        return cinemaSlug;
    }

    public void setCinemaSlug(String cinemaSlug) {
        this.cinemaSlug = cinemaSlug;
    }

    public String getCinemaLogo() {
        return cinemaLogo;
    }

    public void setCinemaLogo(String cinemaLogo) {
        this.cinemaLogo = cinemaLogo;
    }

    public String getCinemaImage() {
        return cinemaImage;
    }

    public void setCinemaImage(String cinemaImage) {
        this.cinemaImage = cinemaImage;
    }

    public String getCinemaImageLarge() {
        return cinemaImageLarge;
    }

    public void setCinemaImageLarge(String cinemaImageLarge) {
        this.cinemaImageLarge = cinemaImageLarge;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getListPrice() {
        return listPrice;
    }

    public void setListPrice(String listPrice) {
        this.listPrice = listPrice;
    }

    public Integer getMaxSeat() {
        return maxSeat;
    }

    public void setMaxSeat(Integer maxSeat) {
        this.maxSeat = maxSeat;
    }

    public Integer getpCinemaId() {
        return pCinemaId;
    }

    public void setpCinemaId(Integer pCinemaId) {
        this.pCinemaId = pCinemaId;
    }

    public String getpCinemaName() {
        return pCinemaName;
    }

    public void setpCinemaName(String pCinemaName) {
        this.pCinemaName = pCinemaName;
    }

    public String getpCinemaLogo() {
        return pCinemaLogo;
    }

    public void setpCinemaLogo(String pCinemaLogo) {
        this.pCinemaLogo = pCinemaLogo;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getCinemaSlugNew() {
        return cinemaSlugNew;
    }

    public void setCinemaSlugNew(String cinemaSlugNew) {
        this.cinemaSlugNew = cinemaSlugNew;
    }
}
