package com.example.demo.model;

import java.sql.Date;
import java.util.Objects;

public class ResponseHolidayDTO {
    private Long id;
    private String title;
    private String startDate;
    private Integer duration;
    private Double price;
    private Integer freeSlots;
    private ResponseLocationDTO location;


    public ResponseHolidayDTO(long holidayId, CreateLocationDTO location, String title, Date startDate, int duration, String price, int freeSlots) {
    }

    public ResponseHolidayDTO(Long id, ResponseLocationDTO location, String title, String startDate,
                              Integer duration, Double price, Integer freeSlots) {
        this.id = id;
        this.location = location;
        this.title = title;
        this.startDate = startDate;
        this.duration = duration;
        this.price = price;
        this.freeSlots = freeSlots;
    }

    public ResponseHolidayDTO() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getFreeSlots() {
        return freeSlots;
    }

    public void setFreeSlots(Integer freeSlots) {
        this.freeSlots = freeSlots;
    }

    public ResponseLocationDTO getLocation() {
        return location;
    }

    public void setLocation(ResponseLocationDTO location) {
        this.location = location;
    }

    // Equals and HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResponseHolidayDTO that = (ResponseHolidayDTO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(title, that.title) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(duration, that.duration) &&
                Objects.equals(price, that.price) &&
                Objects.equals(freeSlots, that.freeSlots) &&
                Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, startDate, duration, price, freeSlots, location);
    }

    // toString

    @Override
    public String toString() {
        return "ResponseHolidayDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", startDate='" + startDate + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                ", freeSlots=" + freeSlots +
                ", location=" + location +
                '}';
    }
}
