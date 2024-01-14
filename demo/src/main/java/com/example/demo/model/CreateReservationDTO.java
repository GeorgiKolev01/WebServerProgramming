package com.example.demo.model;

public class CreateReservationDTO {
    private String contactName;
    private String phoneNumber;
    private CreateHolidayDTO holiday;

    public CreateReservationDTO() {
    }

    public CreateReservationDTO(String contactName, String phoneNumber, CreateHolidayDTO holiday) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.holiday = holiday;
    }

    // Getters and setters
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

    public CreateHolidayDTO getHoliday() {
        return holiday;
    }

    public void setHoliday(CreateHolidayDTO holiday) {
        this.holiday = holiday;
    }
}
