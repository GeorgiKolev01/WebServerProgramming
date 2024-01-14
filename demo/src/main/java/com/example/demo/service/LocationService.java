package com.example.demo.service;

import com.example.demo.model.CreateLocationDTO;
import com.example.demo.model.ResponseLocationDTO;
import com.example.demo.model.UpdateLocationDTO;

import java.util.List;

public interface LocationService {
    ResponseLocationDTO createLocation(CreateLocationDTO createLocationDTO);
    Boolean deleteLocation(Long locationId);
    List<ResponseLocationDTO> getLocations();
    ResponseLocationDTO getLocationById(Long locationId);
    ResponseLocationDTO updateLocation(UpdateLocationDTO updateLocationDTO);
}
