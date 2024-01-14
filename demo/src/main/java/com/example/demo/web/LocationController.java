package com.example.demo.web;

import com.example.demo.model.CreateLocationDTO;
import com.example.demo.model.ResponseLocationDTO;
import com.example.demo.model.UpdateLocationDTO;
import com.example.demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationController {
    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping
    public ResponseEntity<ResponseLocationDTO> createLocation(@RequestBody CreateLocationDTO createLocationDTO) {
        try {
            // Assuming that locationService.createLocation(createLocationDTO)
            // creates a location and returns the created location
            ResponseLocationDTO createdLocation = locationService.createLocation(createLocationDTO);

            // If the location is created successfully, return a ResponseEntity with HTTP status 201 (Created)
            return new ResponseEntity<>(createdLocation, HttpStatus.CREATED);
        } catch (Exception e) {
            // If an exception occurs during the creation, return an HTTP status 500 (Internal Server Error)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{locationId}")
    public ResponseEntity<Boolean> deleteLocation(@PathVariable Long locationId) {
        try {
            // Assuming that locationService.deleteLocation(locationId)
            // deletes the location with the specified ID
            boolean isDeleted = locationService.deleteLocation(locationId);

            // If the location is deleted successfully, return a ResponseEntity with HTTP status 200 (OK)
            return new ResponseEntity<>(isDeleted, HttpStatus.OK);
        } catch (Exception e) {
            // If an exception occurs during the deletion, return an HTTP status 500 (Internal Server Error)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<ResponseLocationDTO>> getAllLocations() {
        try {
            // Assuming that locationService.getAllLocations()
            // retrieves all locations from the service
            List<ResponseLocationDTO> locations = locationService.getLocations();

            // Return a ResponseEntity with the list of locations and HTTP status 200 (OK)
            return new ResponseEntity<>(locations, HttpStatus.OK);
        } catch (Exception e) {
            // If an exception occurs during the retrieval, return an HTTP status 500 (Internal Server Error)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{locationId}")
    public ResponseEntity<ResponseLocationDTO> getLocationById(@PathVariable Long locationId) {
        try {
            // Assuming that locationService.getOneLocation(locationId)
            // retrieves a location by ID from the service
            ResponseLocationDTO location = locationService.getLocationById(locationId);

            // If the location is found, return a ResponseEntity with the location and HTTP status 200 (OK)
            if (location != null) {
                return new ResponseEntity<>(location, HttpStatus.OK);
            } else {
                // If the location is not found, return an HTTP status 404 (Not Found)
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            // If an exception occurs during the retrieval, return an HTTP status 500 (Internal Server Error)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity<ResponseLocationDTO> updateLocation(@RequestBody UpdateLocationDTO updateLocationDTO) {
        try {
            // Assuming that locationService.updateLocation(updateLocationDTO)
            // updates the location in the service
            ResponseLocationDTO updatedLocation = locationService.updateLocation(updateLocationDTO);

            // If the location is successfully updated, return a ResponseEntity with the updated location and HTTP status 200 (OK)
            if (updatedLocation != null) {
                return new ResponseEntity<>(updatedLocation, HttpStatus.OK);
            } else {
                // If the location is not found or cannot be updated, return an HTTP status 404 (Not Found) or 400 (Bad Request) as appropriate
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            // If an exception occurs during the update, return an HTTP status 500 (Internal Server Error)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
