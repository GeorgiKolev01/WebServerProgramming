package com.example.demo.service;

import com.example.demo.model.CreateReservationDTO;
import com.example.demo.model.ResponseReservationDTO;
import com.example.demo.model.UpdateReservationDTO;

import java.util.List;

public interface ReservationService {
    ResponseReservationDTO createReservation(CreateReservationDTO createReservationDTO);
    Boolean deleteReservation(Long reservationId);
    List<ResponseReservationDTO> getReservations();
    ResponseReservationDTO getReservationById(Long reservationId);
    ResponseReservationDTO updateReservation(UpdateReservationDTO updateReservationDTO);
}
