package com.example.demo.service.implementation;

import com.example.demo.model.CreateLocationDTO;
import com.example.demo.model.ResponseLocationDTO;
import com.example.demo.model.UpdateLocationDTO;
import com.example.demo.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Override
    public ResponseLocationDTO createLocation(CreateLocationDTO createLocationDTO) {
        return null;
    }

    @Override
    public Boolean deleteLocation(Long locationId) {
        return null;
    }

    @Override
    public List<ResponseLocationDTO> getLocations() {
        return null;
    }

    @Override
    public ResponseLocationDTO getLocationById(Long locationId) {
        return null;
    }

    @Override
    public ResponseLocationDTO updateLocation(UpdateLocationDTO updateLocationDTO) {
        return null;
    }
}
