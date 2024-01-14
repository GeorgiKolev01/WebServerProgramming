package com.example.demo.web;

import com.example.demo.model.CreateReservationDTO;
import com.example.demo.model.ResponseReservationDTO;
import com.example.demo.model.UpdateReservationDTO;
import com.example.demo.service.ReservationService;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @PostMapping
    public ResponseEntity<ResponseReservationDTO> createReservation(@RequestBody CreateReservationDTO createReservationDTO) {
        ResponseReservationDTO createdReservation = reservationService.createReservation(createReservationDTO);
        try {
        // Return a ResponseEntity with the created reservation and HTTP status 200 (OK)
        return new ResponseEntity<>(createdReservation, HttpStatus.OK);
    } catch (Exception e) {
        // If an exception occurs during the creation, return an HTTP status 400 (Bad Request)
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);}
    }

    @DeleteMapping("/{reservationId}")
    public ResponseEntity<Boolean> deleteReservation(@PathVariable Long reservationId) {
        try {
            // Assuming that reservationService.deleteReservationById returns true if deletion is successful
            boolean isDeleted = reservationService.deleteReservation(reservationId);

            if (isDeleted) {
                // Return a ResponseEntity with HTTP status 200 (OK)
                return new ResponseEntity<>(true, HttpStatus.OK);
            } else {
                // If deletion is unsuccessful, return an HTTP status 400 (Bad Request)
                return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            // If an exception occurs during deletion, return an HTTP status 500 (Internal Server Error)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<ResponseReservationDTO>> getAllReservations() {
        try {
            // Assuming that reservationService.getAllReservations() returns a list of reservations
            List<ResponseReservationDTO> reservations = reservationService.getReservations();

            // Return a ResponseEntity with HTTP status 200 (OK) and the list of reservations
            return new ResponseEntity<>(reservations, HttpStatus.OK);
        } catch (Exception e) {
            // If an exception occurs during retrieval, return an HTTP status 500 (Internal Server Error)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{reservationId}")
    public ResponseEntity<ResponseReservationDTO> getReservationById(@PathVariable Long reservationId) {
        try {
            // Assuming that reservationService.getReservationById(reservationId) returns a reservation
            ResponseReservationDTO reservation = reservationService.getReservationById(reservationId);

            // If the reservation is found, return a ResponseEntity with HTTP status 200 (OK)
            return new ResponseEntity<>(reservation, HttpStatus.OK);
        } catch (HttpClientErrorException.NotFound e) {
            // If the reservation is not found, return an HTTP status 404 (Not Found)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            // If an exception occurs during retrieval, return an HTTP status 500 (Internal Server Error)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<ResponseReservationDTO> updateReservation(@RequestBody UpdateReservationDTO updateReservationDTO) {
        try {
            // Assuming that reservationService.updateReservation(reservationId, updateReservationDTO)
            // updates the reservation and returns the updated reservation
            ResponseReservationDTO updatedReservation =
                    reservationService.updateReservation(updateReservationDTO);

            // If the reservation is successfully updated, return a ResponseEntity with HTTP status 200 (OK)
            return new ResponseEntity<>(updatedReservation, HttpStatus.OK);
        } catch (HttpClientErrorException.NotFound e) {
            // If the reservation is not found, return an HTTP status 404 (Not Found)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            // If an exception occurs during the update, return an HTTP status 500 (Internal Server Error)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}