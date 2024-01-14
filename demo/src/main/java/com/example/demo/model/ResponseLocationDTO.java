package com.example.demo.model;

import java.util.Objects;

public class ResponseLocationDTO {
    private Long id;
    private String number;
    private String country;
    private String city;
    private String street;
    private String imageUrl;

    public ResponseLocationDTO() {
    }

    public ResponseLocationDTO(Long id, String number, String country, String city, String street, String imageUrl) {
        this.id = id;
        this.number = number;
        this.country = country;
        this.city = city;
        this.street = street;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // Equals and HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseLocationDTO that = (ResponseLocationDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(number, that.number) &&
                Objects.equals(country, that.country) &&
                Objects.equals(city, that.city) &&
                Objects.equals(street, that.street) &&
                Objects.equals(imageUrl, that.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, country, city, street, imageUrl);
    }

    // toString

    @Override
    public String toString() {
        return "ResponseLocationDTO{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
