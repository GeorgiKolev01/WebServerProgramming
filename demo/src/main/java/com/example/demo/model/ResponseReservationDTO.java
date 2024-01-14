package com.example.demo.model;

import java.util.Objects;

public class ResponseReservationDTO {
    private Long id;
    private String contactName;
    private String phoneNumber;
    private ResponseHolidayDTO holiday;


    public ResponseReservationDTO() {
    }

    public ResponseReservationDTO(Long id, String contactName, String phoneNumber, ResponseHolidayDTO holiday) {
        this.id = id;
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.holiday = holiday;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ResponseHolidayDTO getHoliday() {
        return holiday;
    }

    public void setHoliday(ResponseHolidayDTO holiday) {
        this.holiday = holiday;
    }

    // Equals and HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseReservationDTO that = (ResponseReservationDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(contactName, that.contactName) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(holiday, that.holiday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contactName, phoneNumber, holiday);
    }

    // toString

    @Override
    public String toString() {
        return "ResponseReservationDTO{" +
                "id=" + id +
                ", contactName='" + contactName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", holiday=" + holiday +
                '}';
    }
}
