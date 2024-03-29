package com.example.demo.model;

public class CreateLocationDTO {
    private String number;
    private String country;
    private String city;
    private String street;
    private String imageUrl;

    public CreateLocationDTO() {
    }

    public CreateLocationDTO(String number, String country, String city, String street, String imageUrl) {
        this.number = number;
        this.country = country;
        this.city = city;
        this.street = street;
        this.imageUrl = imageUrl;
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
}
