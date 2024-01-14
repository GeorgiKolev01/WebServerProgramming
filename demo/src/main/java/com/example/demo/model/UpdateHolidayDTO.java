package com.example.demo.model;

import java.sql.Date;

public class UpdateHolidayDTO {
    private Long id;
    private String title;
    private String startDate;
    private Integer duration;
    private Double price;
    private Integer freeSlots;
    private ResponseLocationDTO location;

    public UpdateHolidayDTO(){
    }

    public UpdateHolidayDTO(Long id, String title, String startDate, Integer duration, Double price, Integer freeSlots, ResponseLocationDTO location) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.duration = duration;
        this.price = price;
        this.freeSlots = freeSlots;
        this.location = location;
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
}
