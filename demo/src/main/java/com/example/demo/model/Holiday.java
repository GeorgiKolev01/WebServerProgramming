package com.example.demo.model;

import jakarta.persistence.*;

import javax.xml.stream.Location;
import java.time.LocalDate;

@Entity
public class Holiday {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private LocalDate startDate;
    private int duration;
    private double price;
    private int freeSlots;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private static Location location;

    // Constructors, getters, setters, and other methods

    public Holiday() {
        // Default constructor needed by JPA
    }

    public Holiday(String title, LocalDate startDate, int duration, double price, int freeSlots, Location location) {
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFreeSlots() {
        return freeSlots;
    }

    public void setFreeSlots(int freeSlots) {
        this.freeSlots = freeSlots;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public static Holiday mapCreateDTOToEntity(CreateHolidayDTO createHolidayDTO) {
        Holiday holiday = new Holiday();

        holiday.setTitle(createHolidayDTO.getTitle());
        holiday.setStartDate(LocalDate.parse(createHolidayDTO.getStartDate()));
        holiday.setDuration(createHolidayDTO.getDuration());
        holiday.setPrice(createHolidayDTO.getPrice());
        holiday.setFreeSlots(createHolidayDTO.getFreeSlots());
        holiday.setLocation(location); // Assuming location is passed as a parameter

        return holiday;
    }

    public static ResponseHolidayDTO mapEntityToResponseDTO(Holiday holiday) {
        ResponseHolidayDTO responseHolidayDTO = new ResponseHolidayDTO();

        responseHolidayDTO.setId(holiday.getId());
        responseHolidayDTO.setTitle(holiday.getTitle());
        responseHolidayDTO.setStartDate(holiday.getStartDate().toString());
        responseHolidayDTO.setDuration(holiday.getDuration());
        responseHolidayDTO.setPrice(holiday.getPrice());
        responseHolidayDTO.setFreeSlots(holiday.getFreeSlots());


        return responseHolidayDTO;
    }
}
