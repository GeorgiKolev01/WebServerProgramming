package com.example.demo.service.implementation;

import com.example.demo.dao.HolidayRepository;
import com.example.demo.model.CreateHolidayDTO;
import com.example.demo.model.Holiday;
import com.example.demo.model.ResponseHolidayDTO;
import com.example.demo.model.UpdateHolidayDTO;
import com.example.demo.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.demo.model.Holiday.mapCreateDTOToEntity;

@Service
public class HolidayServiceImpl implements HolidayService {
    private final HolidayRepository holidayRepository;

    @Autowired
    public HolidayServiceImpl(HolidayRepository holidayRepository) {
        this.holidayRepository = holidayRepository;
    }

    @Override
    public ResponseHolidayDTO createHoliday(CreateHolidayDTO createHolidayDTO) {
        // Convert the CreateHolidayDTO to the entity
        Holiday holiday = mapCreateDTOToEntity(createHolidayDTO);

        // Save the holiday to the database
        Holiday savedHoliday = holidayRepository.save(holiday);

        // Convert the saved holiday to ResponseHolidayDTO
        return mapEntityToResponseDTO(savedHoliday);
    }

    @Override
    public Boolean deleteHoliday(Long holidayId) {
        // Check if the holiday exists
        if (holidayRepository.existsById(holidayId)) {
            // Delete the holiday and return true
            holidayRepository.deleteById(holidayId);
            return true;
        } else {
            // Return false if the holiday does not exist
            return false;
        }
    }

    @Override
    public List<ResponseHolidayDTO> getHolidays() {
        return null;
    }

    @Override
    public List<ResponseHolidayDTO> getAllHolidays() {
        // Retrieve all holidays from the database
        List<Holiday> holidays = holidayRepository.findAll();

        // Convert the list of holidays to a list of ResponseHolidayDTO
        return mapEntityListToResponseDTOList(holidays);
    }

    @Override
    public ResponseHolidayDTO getHolidayById(Long holidayId) {
        // Retrieve the holiday by ID from the database
        Optional<Holiday> optionalHoliday = holidayRepository.findById(holidayId);

        // Check if the holiday exists
        if (optionalHoliday.isPresent()) {
            // Convert the holiday to ResponseHolidayDTO and return
            return mapEntityToResponseDTO(optionalHoliday.get());
        } else {
            // Return null if the holiday does not exist
            return null;
        }
    }

    @Override
    public ResponseHolidayDTO updateHoliday(UpdateHolidayDTO updateHolidayDTO) {
        // Retrieve the existing holiday by ID
        Optional<Holiday> optionalHoliday = holidayRepository.findById(updateHolidayDTO.getId());

        // Check if the holiday exists
        if (optionalHoliday.isPresent()) {
            // Update the holiday with the new information
            Holiday existingHoliday = optionalHoliday.get();
            updateHolidayEntity(existingHoliday, updateHolidayDTO);

            // Save the updated holiday to the database
            Holiday updatedHoliday = holidayRepository.save(existingHoliday);

            // Convert the updated holiday to ResponseHolidayDTO and return
            return mapEntityToResponseDTO(updatedHoliday);
        } else {
            // Return null if the holiday does not exist
            return null;
        }
    }
}
