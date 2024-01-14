package com.example.demo.service.implementation;


import com.example.demo.model.CreateReservationDTO;
import com.example.demo.model.ResponseReservationDTO;
import com.example.demo.model.UpdateReservationDTO;
import com.example.demo.service.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Override
    public ResponseReservationDTO createReservation(CreateReservationDTO createReservationDTO) {
        return null;
    }

    @Override
    public Boolean deleteReservation(Long reservationId) {
        return null;
    }

    @Override
    public List<ResponseReservationDTO> getReservations() {
        return null;
    }

    @Override
    public ResponseReservationDTO getReservationById(Long reservationId) {
        return null;
    }

    @Override
    public ResponseReservationDTO updateReservation(UpdateReservationDTO updateReservationDTO) {
        return null;
    }
}
